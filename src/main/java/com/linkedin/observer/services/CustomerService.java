package com.linkedin.observer.services;

import com.linkedin.observer.Customer;
import com.linkedin.observer.CustomerEvent;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

public class CustomerService {

    public void createCustomer(@Observes @Priority(10) @CustomerEvent(CustomerEvent.Type.ADD) Customer customer) {
        System.out.println("Customer added: " + customer.toString());
    }

    public void deleteCustomer(@Observes @CustomerEvent(CustomerEvent.Type.REMOVE) Customer customer) {
        System.out.println("Customer deleted: " + customer.toString());
    }
}