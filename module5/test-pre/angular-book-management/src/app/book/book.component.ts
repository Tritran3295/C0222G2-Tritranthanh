import {Component, OnInit} from '@angular/core';
import {Book} from '../model/book';
import {BookService} from '../service/book.service';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  bookList: Book[] = [];
  p = 1;
  nameModal: string;

  constructor(private bookService: BookService,
              private toastr: ToastrService) {
  }

  ngOnInit(): void {
    this.bookService.getAll().subscribe(data => {
      return this.bookList = data;
    });
  }

  elementDelete(id: number, name: string) {
  }

  deleteCustomer() {
  }
}
