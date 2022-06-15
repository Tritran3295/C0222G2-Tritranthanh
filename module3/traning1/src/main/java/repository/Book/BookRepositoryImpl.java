package repository.Book;

import model.Book;
import repository.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements IBookRepository{
    private ConnectDatabase connectionDB = new ConnectDatabase();
    private static final String SELECT_ALL_BOOK ="select * from book ";
    @Override
    public List<Book> selectAllBook() {
        List<Book> bookList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_BOOK)) {
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
            String codeBook = resultSet.getString("ma_sach");
            String nameBook = resultSet.getString("ten_sach");
            String author = resultSet.getString("tac_gia");
            String describe = resultSet.getString("mo_ta");
            Integer amount = resultSet.getInt("so_luong");
            bookList.add(new Book(codeBook,nameBook,author,describe,amount));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return bookList;
    }
}
