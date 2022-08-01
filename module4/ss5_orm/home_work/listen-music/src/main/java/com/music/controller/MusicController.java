package com.music.controller;

import com.music.model.Music;
import com.music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("")
    public String list(Model model){
        model.addAttribute("songs",musicService.selectAll());
        return "index";
    }
    @GetMapping("/create-song")
    public String showFormCreate(Model model){
        model.addAttribute("song",new Music());
        return "create";
    }
    @PostMapping("/create-song")
    public String save(@ModelAttribute Music music){
        musicService.save(music);
        return "redirect:/songs";
    }
    @GetMapping("/edit-song/{id}")
    public String showFormEdit(@PathVariable int id,Model model){
        model.addAttribute("song",musicService.findById(id));
        return "edit";
    }
    @PostMapping("/edit-song")
    public String edit(@ModelAttribute Music music){
        musicService.update(music);
        return "redirect:/songs";
    }
    @GetMapping("delete-song/{id}")
    public String deleteSong(@ModelAttribute Music music){
        musicService.remove(music.getId());
        return "redirect:/songs";
    }

}
