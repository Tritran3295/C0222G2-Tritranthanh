import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Category} from '../model/category';
import {Router} from '@angular/router';
import {ToastrModule, ToastrService} from 'ngx-toastr';
import {BookService} from '../service/book.service';
import {CategoryService} from '../service/category.service';

@Component({
  selector: 'app-book-create',
  templateUrl: './book-create.component.html',
  styleUrls: ['./book-create.component.css']
})
export class BookCreateComponent implements OnInit {
  bookForm: FormGroup;
  categoryList: Category[] = [];

  constructor(private router: Router,
              private toastr: ToastrService,
              private bookService: BookService,
              private categoryService: CategoryService) {
    this.categoryService.getAll().subscribe(value => {
      this.categoryList = value;
    });
  }

  ngOnInit(): void {
    this.bookForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl(),
      category: new FormControl(),
      dateBorrow: new FormControl(),
      dateBack: new FormControl(),
      amount: new FormControl(),
    });
  }

  createBook() {
    const book = this.bookForm.value;
    this.bookService.save(book).subscribe();
    this.router.navigateByUrl('/book/list');
    this.toastr.success('Create success', 'tittle', {
      timeOut: 1500, progressBar: false
    });
  }
}
