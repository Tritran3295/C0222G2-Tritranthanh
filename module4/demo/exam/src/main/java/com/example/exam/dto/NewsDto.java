package com.example.exam.dto;

import com.example.exam.model.OptionNews;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;

public class NewsDto {

    private int id;

    @NotBlank
    @Size(min = (1),max = (50))
    private String title;
    @NotNull
    private OptionNews optionNews;

    @DateTimeFormat
    private String dateUpdate;
    @NotBlank
    private String author;
    @NotNull
    private int status;

    public NewsDto() {
    }

    public NewsDto(int id, String title, OptionNews optionNews, String dateUpdate, String author, int status) {
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
