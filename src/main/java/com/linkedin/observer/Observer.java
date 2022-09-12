package com.linkedin.observer;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

class Subject {

    @Inject
    private Event<Customer> customerEvent;

    public void newCustomer(Customer customer) {
        customerEvent.fire(customer);
    }
}

class Observer {

    public void addCustomer(@Observes Customer customer) {
        // add customer logic
    }
}