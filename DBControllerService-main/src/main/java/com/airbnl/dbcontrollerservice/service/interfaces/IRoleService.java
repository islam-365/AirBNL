package com.airbnl.dbcontrollerservice.service.interfaces;

import com.airbnl.dbcontrollerservice.model.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getAllRoles();

    Role getRoleById(long roleId);

    Role save(Role role);
}
