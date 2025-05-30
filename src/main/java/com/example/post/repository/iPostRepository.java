package com.example.post.repository;

import com.example.post.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
 @Repository
public interface iPostRepository extends JpaRepository<Post, Long> {
//    List<Post> findAll();
//    Post findById(Long id);
//    void save(Post post);

}
