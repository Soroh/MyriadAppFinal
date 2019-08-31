package com.myriad.christian.myriadapp.service.imple;

import com.myriad.christian.myriadapp.models.Role;
import com.myriad.christian.myriadapp.repositories.RoleRepository;
import com.myriad.christian.myriadapp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<Role> findById(Long roleId) {
        List<Role> roles = new ArrayList<>();
         roles.add(roleRepository.findById(roleId).orElse(new Role("MYRIAD")));
        return roles;
    }
}
