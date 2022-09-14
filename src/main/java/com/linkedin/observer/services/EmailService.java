package com.linkedin.observer.services;

import com.linkedin.observer.Customer;

import javax.annotation.Priority;
import javax.enterprise.event.Observes;

public class EmailService {

    public void sendWelcomeEmail(@Observes @Priority(1000) Customer customer) {
        // send email
    }
}
