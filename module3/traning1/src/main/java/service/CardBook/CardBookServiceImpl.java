package service.CardBook;

import model.CardBook;
import repository.CardBook.CardBookRepositoryImpl;
import repository.CardBook.ICardBookRepository;

import java.util.List;

public class CardBookServiceImpl implements ICardBookService{
    ICardBookRepository iCardBookRepository = new CardBookRepositoryImpl();
    @Override
    public List<CardBook> selectAllCardBook() {
        return iCardBookRepository.selectAllCardBook();
    }
}
