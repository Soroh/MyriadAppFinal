package com.myriad.christian.myriadapp.service;

import com.myriad.christian.myriadapp.models.Post;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Page<Post> getAllPostsPaged(int pageNo);

    Post savePost(Post post);

    void deletePost(Long postId);

    Post findById(Long postId);

    Page<Post> search(String search, int pageNo);

    List<Post> getAllPosts();

//    Myriad findByEmail(String email);

}
