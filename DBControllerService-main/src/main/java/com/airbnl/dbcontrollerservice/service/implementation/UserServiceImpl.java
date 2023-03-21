package com.airbnl.dbcontrollerservice.service.implementation;

import com.airbnl.dbcontrollerservice.model.User;
import com.airbnl.dbcontrollerservice.repositories.UserRepository;
import com.airbnl.dbcontrollerservice.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByUserName(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public User getUserByUserId(long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
