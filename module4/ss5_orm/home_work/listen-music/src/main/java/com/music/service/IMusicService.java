package com.music.service;

import com.music.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> selectAll();

    void save(Music music);

    Music findById(int id);

    void update(Music music);

    void remove(int id);
}
