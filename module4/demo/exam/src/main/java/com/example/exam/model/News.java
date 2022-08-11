package com.example.exam.model;

import javax.persistence.*;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "option_news_id",referencedColumnName = "id")
    private OptionNews optionNews;

    private String dateUpdate;
    private String author;
    @Column(columnDefinition = "bit(1) default 0")
    private int status;

    public News() {
    }

    public News(int id, String title, OptionNews optionNews, String dateUpdate, String author, int status) {
        this.id = id;
        this.title = title;
        this.optionNews = optionNews;
        this.dateUpdate = dateUpdate;
        this.author = author;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OptionNews getOptionNews() {
        return optionNews;
    }

    public void setOptionNews(OptionNews optionNews) {
        this.optionNews = optionNews;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
