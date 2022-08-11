package com.example.exam.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class OptionNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameOptionNews;

    @JsonBackReference
    @OneToMany(mappedBy = "optionNews")
    private List<News> newsList;

    public OptionNews() {
    }

    public OptionNews(int id, String nameOptionNews, List<News> newsList) {
        this.id = id;
        this.nameOptionNews = nameOptionNews;
        this.newsList = newsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOptionNews() {
        return nameOptionNews;
    }

    public void setNameOptionNews(String nameOptionNews) {
        this.nameOptionNews = nameOptionNews;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }
}
