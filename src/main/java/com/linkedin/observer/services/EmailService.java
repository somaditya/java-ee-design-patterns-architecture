package com.linkedin.observer.services;

import com.linkedin.observer.Customer;

import javax.enterprise.event.Observes;

public class EmailService {

    public void sendWelcomeEmail(@Observes Customer customer) {
        // send email
    }
}
