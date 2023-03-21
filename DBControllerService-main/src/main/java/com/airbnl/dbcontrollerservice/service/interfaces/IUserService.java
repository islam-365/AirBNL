package com.airbnl.dbcontrollerservice.service.interfaces;

import com.airbnl.dbcontrollerservice.model.User;

public interface IUserService {
    User getUserByUserName(String username);

    User getUserByUserId(long userId);

    User saveUser(User user);
}
