package model;

public class Book {
    private String codeBook;
    private String nameBook;
    private String author;
    private String describe;
    private Integer amount;

    public Book() {
    }

    public Book(String codeBook, String nameBook, String author, String describe, Integer amount) {
        this.codeBook = codeBook;
        this.nameBook = nameBook;
        this.author = author;
        this.describe = describe;
        this.amount = amount;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
