package com.myriad.christian.myriadapp.repositories;

import com.myriad.christian.myriadapp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post,Long> {

}
