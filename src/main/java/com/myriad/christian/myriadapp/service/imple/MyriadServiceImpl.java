package com.myriad.christian.myriadapp.service.imple;

import com.myriad.christian.myriadapp.models.Myriad;
import com.myriad.christian.myriadapp.repositories.MyriadRepo;
import com.myriad.christian.myriadapp.service.MyriadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyriadServiceImpl implements MyriadService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private MyriadRepo myriadRepo;

    @Override
    public Page<Myriad> getAllCustomersPaged(int pageNo) {
        return null;
    }

    @Override
    public Myriad saveMyriad(Myriad myriad) {
        if(myriad.getActive()==0) myriad.setPassword(passwordEncoder.encode(myriad.getPassword()));

        return myriadRepo.save(myriad);
    }

    @Override
    public void deleteMyriad(Long myriadId) {

    }

    @Override
    public Myriad findById(Long myriadId) {
        return myriadRepo.findById(myriadId).orElse(new Myriad());
    }

    @Override
    public Page<Myriad> search(String search, int pageNo) {
        return null;
    }

    @Override
    public List<Myriad> getAllMyriads() {
        return null;
    }

    @Override
    public Optional<Myriad> findByEmail(String email) {
        return Optional.ofNullable(myriadRepo.findByEmailAddress(email));
    }


    public boolean isEmailAlreadyInUse(String email) {
        Myriad myriad =myriadRepo.findByEmailAddress(email);

        if ( myriad== null) {
            return false;
        }
        return true;
    }
}
