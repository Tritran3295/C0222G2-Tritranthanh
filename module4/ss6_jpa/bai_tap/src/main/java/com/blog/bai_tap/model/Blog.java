package com.blog.bai_tap.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameBlog;
    private String titleBlog;
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private boolean status;
    public Blog() {
    }

    public Blog(int id, String nameBlog, String titleBlog) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.titleBlog = titleBlog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getTitleBlog() {
        return titleBlog;
    }

    public void setTitleBlog(String titleBlog) {
        this.titleBlog = titleBlog;
    }
}
