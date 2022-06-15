package repository.CardBook;

import model.CardBook;
import repository.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CardBookRepositoryImpl implements ICardBookRepository{
    ConnectDatabase connectDatabase = new ConnectDatabase();
    @Override
    public List<CardBook> selectAllCardBook() {
        List<CardBook> cardBookList = new ArrayList<>();
        try(Connection connection =connectDatabase.getConnection();
        ) {
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
