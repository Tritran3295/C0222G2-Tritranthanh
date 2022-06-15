package repository.Book;

import model.Book;

import java.util.List;

public interface IBookRepository {

    List<Book> selectAllBook();
}
