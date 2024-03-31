package org.humber.project.services;

import java.util.List;

import org.humber.project.domain.User;

public interface UserService {

    List<User> getAllUsers();

    void insertUser(User User);

    void updateUser(User User);

    void save(User user);

    void registerUser(User user);

    void deleteUser(Long id);
}
