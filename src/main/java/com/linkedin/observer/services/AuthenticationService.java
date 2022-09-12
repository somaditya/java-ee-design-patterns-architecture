package com.linkedin.observer.services;

import com.linkedin.observer.Customer;

import javax.enterprise.event.Observes;

public class AuthenticationService {

    public void createAuthenticationCredentials(@Observes Customer customer) {
        System.out.println("Authentication created for " + customer.getName());
    }
}
