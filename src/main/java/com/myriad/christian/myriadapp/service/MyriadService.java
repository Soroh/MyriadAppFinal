package com.myriad.christian.myriadapp.service;

import com.myriad.christian.myriadapp.models.Myriad;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface MyriadService {

    Page<Myriad> getAllCustomersPaged(int pageNo);

    Myriad saveMyriad(Myriad myriad);

    void deleteMyriad(Long myriadId);

    Myriad findById(Long myriadId);

    Page<Myriad> search(String search, int pageNo);

    List<Myriad> getAllMyriads();

    Optional<Myriad> findByEmail(String email);
    boolean isEmailAlreadyInUse(String email);

}
