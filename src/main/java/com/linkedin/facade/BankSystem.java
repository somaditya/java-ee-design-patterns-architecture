package com.linkedin.facade;

import com.linkedin.facade.subsystems.CreditRatingService;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class BankSystem {

    @EJB
    private CreditRatingService creditRatingService;
    
    // TODO
}
