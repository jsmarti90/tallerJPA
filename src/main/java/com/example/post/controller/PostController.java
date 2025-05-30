package com.example.post.controller;


import com.example.post.model.Post;
import com.example.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping
    public List<Post> listarPosts(){
        return postService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> listaPostPorId(@PathVariable Long id){
        Post post = postService.obtenerPorId(id);
        if (post == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(post);
        }


    }

    @PostMapping
    public void guardarPost(@RequestBody Post post){
        postService.guardarPost(post);

    }

    @DeleteMapping("/{id}")
    public void eliminarPost(@PathVariable Long id) {
        postService.eliminarPost(id);
    }
}
