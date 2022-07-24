package com.blog.dto;

import com.blog.model.Category;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class BlogDTO {
    private int id;
    @NotNull
    @NotEmpty
    @NotNull
    private String nameBlog;
    @NotBlank
    private String titleBlog;
    private Category category;

    public BlogDTO() {
    }

    public BlogDTO(int id, String nameBlog, String titleBlog, Category category) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.titleBlog = titleBlog;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
