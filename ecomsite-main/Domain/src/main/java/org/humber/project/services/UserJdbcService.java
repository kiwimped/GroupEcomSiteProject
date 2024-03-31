package org.humber.project.services;

import org.humber.project.domain.User;

import java.util.List;

public interface UserJdbcService {

    List<User> findAll();

    void insert(User user);

    void update(User user);

    void save(User user);

    void delete(Long user);

}