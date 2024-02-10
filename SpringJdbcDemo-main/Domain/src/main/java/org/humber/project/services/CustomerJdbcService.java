package org.humber.project.services;

import org.humber.project.domain.Customer;

import java.util.List;

public interface CustomerJdbcService {

    List<Customer> findAll();

    void insert(Customer customer);

    void update(Customer customer);

}