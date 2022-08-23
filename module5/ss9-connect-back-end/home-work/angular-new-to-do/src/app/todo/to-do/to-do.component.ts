import {Component, OnInit} from '@angular/core';
import {Todo} from '../../model/to-do';
import {FormControl} from '@angular/forms';
import {ToDoService} from '../../service/to-do.service';


@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.css']
})
export class ToDoComponent implements OnInit {
  todos: Todo[] = [];
  content = new FormControl();

  constructor(private todoService: ToDoService) {
  }

  ngOnInit() {
    this.todoService.getTodos().subscribe(next => {
      this.todos = next;
    }, error => {
      console.log(error);
    }, () => {
      console.log('complete');
    });
  }

  toggleTodo(i: number) {
    const todo = this.todos[i];
    const todoData = {
      ...todo,
      complete: !todo.complete
    };
    this.todoService.updateTodo(todoData).subscribe(next => {
      this.todos[i].complete = next.complete;
    });
  }

  addTodo() {
    const todo: Partial<Todo> = {
      content: this.content.value,
      complete: false
    };
    this.todoService.createTodo(todo).subscribe(next => {
      this.todos.unshift(next);
      this.content.setValue('');
    });
  }

  deleteTodo(i) {
    const todo = this.todos[i];
    this.todoService.deleteTodo(todo.id).subscribe(
      () => {
        this.todos = this.todos.filter(
          t => t.id !== todo.id
        );
      });
  }
}
