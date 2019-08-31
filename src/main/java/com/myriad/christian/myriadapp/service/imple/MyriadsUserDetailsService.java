package com.myriad.christian.myriadapp.service.imple;

import com.myriad.christian.myriadapp.models.CustomUserDetails;
import com.myriad.christian.myriadapp.models.Myriad;
import com.myriad.christian.myriadapp.repositories.MyriadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MyriadsUserDetailsService implements UserDetailsService {
    @Autowired
    private MyriadRepo myriadRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Optional< Myriad> optionalMyriad = Optional.ofNullable(myriadRepo.findByEmailAddress(username));
        optionalMyriad.orElseThrow(()->new UsernameNotFoundException("Username not found"));

      return optionalMyriad.map(CustomUserDetails::new).get();

    }
}
