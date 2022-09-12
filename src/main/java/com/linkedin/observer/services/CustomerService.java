package com.linkedin.observer.services;

import com.linkedin.observer.Customer;

import javax.enterprise.event.Observes;

public class CustomerService {

    public void createCustomer(@Observes Customer customer) {
        System.out.println("Customer added: " + customer.toString());
    }
}
