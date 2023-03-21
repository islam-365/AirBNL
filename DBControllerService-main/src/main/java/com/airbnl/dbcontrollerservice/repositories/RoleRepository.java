package com.airbnl.dbcontrollerservice.repositories;

import com.airbnl.dbcontrollerservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findById(long id);
}
