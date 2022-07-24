package com.music.dto;

import com.music.model.Category;

import javax.validation.constraints.*;

public class MusicDTO {
    private int id;

    @NotEmpty
    @NotNull
    @NotBlank
    @Size(max = 800,message = "can't longger 800 char")
    @Pattern(regexp = "[A-Za-z0-9\\s]+",message = "no valid")
    private String name;

    @NotEmpty
    @NotNull
    @NotBlank
    @Size(max = 300,message = "can't longger 300 char")
    @Pattern(regexp = "[A-Za-z0-9\\s]+",message = "no valid")
    private String singer;

    @NotNull
    private Category category;

    public MusicDTO() {
    }

    public MusicDTO(int id, String name, String singer, Category category) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
