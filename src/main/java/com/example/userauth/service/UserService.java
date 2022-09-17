package com.example.userauth.service;

import com.example.userauth.domains.appuser;
import com.example.userauth.domains.role;

import java.util.List;

public interface UserService {
    appuser saveUser(appuser user);
    role saveRole(role role);
    void addRoleToUser(String username, String roleName);
    appuser getUser(String username);
    List<appuser> getUsers();

}
