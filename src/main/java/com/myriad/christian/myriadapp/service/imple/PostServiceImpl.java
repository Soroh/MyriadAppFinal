package com.myriad.christian.myriadapp.service.imple;


import com.myriad.christian.myriadapp.models.Post;
import com.myriad.christian.myriadapp.repositories.PostRepo;
import com.myriad.christian.myriadapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;

    @Override
    public Page<Post> getAllPostsPaged(int pageNo) {
        return null;
    }

    @Override
    public Post savePost(Post post) {
        return postRepo.save(post);
    }

    @Override
    public void deletePost(Long postId) {

    }

    @Override
    public Post findById(Long postId) {
        return postRepo.findById(postId).orElse(new Post());
    }

    @Override
    public Page<Post> search(String search, int pageNo) {
        return null;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepo.findAll(Sort.by("postingDateTime").descending());
    }
}
