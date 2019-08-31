package com.myriad.christian.myriadapp.repositories;

import com.myriad.christian.myriadapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role,Long> {
}
