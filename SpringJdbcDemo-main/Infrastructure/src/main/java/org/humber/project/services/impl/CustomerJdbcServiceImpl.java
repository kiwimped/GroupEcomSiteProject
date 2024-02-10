package org.humber.project.services.impl;

import org.humber.project.domain.Customer;
import org.humber.project.services.CustomerJdbcService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerJdbcServiceImpl implements CustomerJdbcService {
    private final JdbcTemplate jdbcTemplate;

    public CustomerJdbcServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
     * public List<Customer> findAll() {
     * return jdbcTemplate.query("SELECT * FROM student", new
     * BeanPropertyRowMapper<>(Customer.class));
     * }
     * 
     * public void insert(Customer student) {
     * jdbcTemplate.
     * update("INSERT INTO student(student_id, name, gender, semester) VALUES (?, ?, ?, ?)"
     * ,
     * student.getCustomerId(), student.getName(), student.getGender(),
     * student.getSemester());
     * }
     * 
     * public void update(Customer student) {
     * jdbcTemplate.
     * update("UPDATE student SET name = ?, gender = ?, semester = ? WHERE studentId = ?"
     * ,
     * student.getName(), student.getGender(), student.getSemester(),
     * student.getCustomerId());
     * }
     */
    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer", new BeanPropertyRowMapper<>(Customer.class));
    }

    public void insert(Customer customer) {
        jdbcTemplate.update(
                "INSERT INTO customer(customer_id,name,email,country,postal_code,phone)VALUES (?, ?, ?, ?,?,?)",
                customer.getCustomerId(), customer.getName(), customer.getEmail(), customer.getPostal_code(),
                customer.getCountry(),
                customer.getPhone());

    }

    public void update(Customer customer) {
        jdbcTemplate.update(
                "UPDATE customer SET name = ?, email = ?, country = ?,phone = ?,postal_code=? WHERE studentId = ?",
                customer.getCustomerId(), customer.getName(), customer.getEmail(), customer.getPostal_code(),
                customer.getCountry(),
                customer.getPhone());
    }

}
