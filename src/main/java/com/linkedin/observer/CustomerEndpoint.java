package com.linkedin.observer;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/customers")
public class CustomerEndpoint {

    @Inject @CustomerEvent(CustomerEvent.Type.ADD)
    private Event<Customer> customerAddEvent;

    @Inject @CustomerEvent(CustomerEvent.Type.REMOVE)
    private Event<Customer> customerRemoveEvent;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void newCustomer(Customer customer) {
        customerAddEvent.fire(customer);
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeCustomer(Customer customer) {
        customerRemoveEvent.fire(customer);
    }
}