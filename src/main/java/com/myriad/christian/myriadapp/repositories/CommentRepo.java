package com.myriad.christian.myriadapp.repositories;

import com.myriad.christian.myriadapp.models.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<PostComment,Long> {
}
