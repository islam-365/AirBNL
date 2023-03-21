package com.airbnl.dbcontrollerservice.repositories;

import com.airbnl.dbcontrollerservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByUsername(String username);

    User findById(long id);
}
