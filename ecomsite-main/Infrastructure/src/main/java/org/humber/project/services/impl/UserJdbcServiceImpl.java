package org.humber.project.services.impl;

import org.humber.project.domain.User;
import org.humber.project.services.UserJdbcService;
import org.humber.project.services.UserJdbcService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserJdbcServiceImpl implements UserJdbcService {
    private final JdbcTemplate jdbcTemplate;

    public UserJdbcServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM user", new BeanPropertyRowMapper<>(User.class));
    }

    public void insert(User user) {
        jdbcTemplate.update(
                "INSERT INTO user(name,email,password,is_admin)VALUES (?, ?, ?, ?,?)",
                user.getName(), user.getEmail(), user.getPassword(), user.getIs_admin());

    }

    public void update(User user) {
        jdbcTemplate.update(
                "UPDATE user SET name = ?, email = ?, password=?,is_admin=? WHERE user_id = ?",
                user.getUser_id(), user.getName(), user.getEmail(), user.getPassword(), user.getIs_admin());
    }

    /*
     * public void delete(User user) {
     * jdbcTemplate.update(
     * "Delete from user where user_id = ?", user.getUser_id());
     * }
     */

    @Override
    public void save(User user) {
        if (user.getUser_id() != null) {
            // If user has an ID, update the existing record
            update(user);
        } else {
            // If user does not have an ID, insert a new record
            insert(user);
        }
    }

    @Override
    public void delete(Long userId) {
        jdbcTemplate.update("DELETE FROM user WHERE user_id = ?", userId);
    }

}
