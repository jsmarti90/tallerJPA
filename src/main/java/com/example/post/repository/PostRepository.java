//package com.example.post.repository;
//
//import com.example.post.model.Post;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class PostRepository implements iPostRepository{
//
//    private final List<Post> posts = new ArrayList<>();
//
//    public PostRepository(){
//        posts.add(new Post(1L,"titulo1","contenido del título1"));
//        posts.add(new Post(2L,"titulo2","contenido del título2"));
//    }
//
//    @Override
//    public List<Post> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public Post findById(Long id) {
//        return null;
//    }
//
//    @Override
//    public void save(Post post) {
//
//    }
//}
