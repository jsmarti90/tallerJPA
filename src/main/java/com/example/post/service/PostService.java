package com.example.post.service;

import com.example.post.model.Post;
import com.example.post.repository.iPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final iPostRepository postRepository;

    @Autowired
    public PostService(iPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> obtenerTodos() {
        return postRepository.findAll();
    }

    public Post obtenerPorId(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public void guardarPost(Post post) {
        postRepository.save(post);
    }

    public void eliminarPost(Long id) {
        postRepository.deleteById(id);
    }
}
