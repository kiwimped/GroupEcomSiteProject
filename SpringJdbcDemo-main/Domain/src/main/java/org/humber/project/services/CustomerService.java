package org.humber.project.services;

import java.util.List;

import org.humber.project.domain.Customer;

public interface CustomerService {

    List<Customer> getAllCustomers();

    void insertCustomer(Customer Customer);

    void updateCustomer(Customer Customer);
}
