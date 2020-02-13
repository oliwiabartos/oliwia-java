package com.oliwia.patterns.strategy;

import com.oliwia.patterns.strategy.predictors.ConservativePredictor;

public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name){
        super(name);
        this.buyPredictor = new ConservativePredictor();

    }
}
