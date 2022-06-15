package repository.CardBook;

import model.CardBook;

import java.util.List;

public interface ICardBookRepository {
    List<CardBook> selectAllCardBook();
}
