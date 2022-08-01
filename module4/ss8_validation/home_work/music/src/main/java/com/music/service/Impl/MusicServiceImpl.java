package com.music.service.Impl;

import com.music.model.Music;
import com.music.repository.IMusicRepository;
import com.music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService {
    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public List<Music> selectAll() {
        return musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }
}
