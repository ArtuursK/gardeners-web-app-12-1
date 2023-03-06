package com.gardeners.app.controllers;

import com.gardeners.app.entities.Post;
import com.gardeners.app.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    PostService postService;

    @RequestMapping(value = "/allposts")
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "index.html";
    }

    /*
    @RequestMapping(value = "/allposts")
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postService.getAllPosts();
        return ResponseEntity.ok().body(posts);
    }*/


}
