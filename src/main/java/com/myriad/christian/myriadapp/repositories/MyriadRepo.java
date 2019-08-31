package com.myriad.christian.myriadapp.repositories;

import com.myriad.christian.myriadapp.models.Myriad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyriadRepo extends JpaRepository<Myriad,Long> {
   //Optional<Myriad> findByEmailAddress(String email);
   Myriad findByEmailAddress(String email);
}
