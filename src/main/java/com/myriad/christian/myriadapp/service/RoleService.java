package com.myriad.christian.myriadapp.service;


import com.myriad.christian.myriadapp.models.Role;

import java.util.List;

public interface RoleService {

    List<Role> findById(Long roleId);
}
