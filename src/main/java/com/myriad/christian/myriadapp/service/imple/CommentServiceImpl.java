package com.myriad.christian.myriadapp.service.imple;

import com.myriad.christian.myriadapp.models.PostComment;
import com.myriad.christian.myriadapp.repositories.CommentRepo;
import com.myriad.christian.myriadapp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepo commentRepo;

    @Override
    public PostComment save(PostComment postComment) {
        return commentRepo.save(postComment);
    }
}
