import {Injectable} from '@angular/core';
import {CategoryService} from './category.service';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Book} from '../model/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {
  private URL_BOOK = 'http://localhost:3000/book';

    constructor(private categoryService: CategoryService,
                private http: HttpClient) {
  }

  getAll(): Observable<Book[]> {
    return this.http.get<Book[]>(this.URL_BOOK);
  }

  save(book: Book): Observable<Book> {
    return this.http.post<Book>(this.URL_BOOK, book);
  }
}
