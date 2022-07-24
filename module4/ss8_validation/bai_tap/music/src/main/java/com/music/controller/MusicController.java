package com.music.controller;

import com.music.dto.MusicDTO;
import com.music.model.Music;
import com.music.service.ICategoryService;
import com.music.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/musics")
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("musicList",musicService.selectAll());
        model.addAttribute("categoryList",categoryService.selectAll());
        return "index";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("musicDTO",new MusicDTO());
        model.addAttribute("categoryList",categoryService.selectAll());
        return "create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute MusicDTO musicDTO, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("categoryList",categoryService.selectAll());
            return "create";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDTO,music);
        musicService.save(music);
        return "redirect:/musics";
    }



}
