package org.humber.project.services.impl;

import lombok.RequiredArgsConstructor;
import org.humber.project.domain.User;
import org.humber.project.services.UserService;
import org.humber.project.services.UserJdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserJdbcService userJdbcService;

    @Override
    public List<User> getAllUsers() {
        System.out.println("Retrieving all users");
        return userJdbcService.findAll();
    }

    @Override
    public void insertUser(User user) {
        userJdbcService.insert(user);
        System.out.println("Saved Record: " + user);
    }

    @Override
    public void updateUser(User user) {
        userJdbcService.update(user);
        System.out.println("Updated Record: " + user);
    }

    @Override
    public void save(User user) {
        // TODO Auto-generated method stub
        userJdbcService.save(user);
        System.out.println("Saved Record: " + user);
    }

    @Override
    public void registerUser(User user) {
        // Hash the password before saving
        String hashedPassword = user.getPassword();
        user.setPassword(hashedPassword);
        userJdbcService.save(user);
        System.out.println("Registered User: " + user);
    }

    @Override
    public void deleteUser(Long user) {
        userJdbcService.delete(user);
        System.out.println("Deleted Record: " + user);
    }
}
