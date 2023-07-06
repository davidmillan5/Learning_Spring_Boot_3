package com.springbootlearning.learningspringboot3.ch2.controller;

import com.springbootlearning.learningspringboot3.ch2.domain.Video;
import com.springbootlearning.learningspringboot3.ch2.services.VideoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    private final VideoService videoService;


    public ApiController(VideoService videoService) {
        this.videoService = videoService;
    }


    @GetMapping("/api/videos")
    public List<Video> all(){
        return videoService.getVideos();
    }

    public Video newVideo(@RequestBody Video newVideo){
        return videoService.create(newVideo);
    }
}
