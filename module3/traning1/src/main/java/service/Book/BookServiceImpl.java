package service.Book;

import model.Book;
import repository.Book.BookRepositoryImpl;
import repository.Book.IBookRepository;

import java.util.List;

public class BookServiceImpl implements iBookService{
    IBookRepository iBookRepository = new BookRepositoryImpl();

    @Override
    public List<Book> selectAllBook() {
        return iBookRepository.selectAllBook();
    }
}
