package com.oliwia.patterns.strategy;

import com.oliwia.patterns.strategy.predictors.AggressivePredictor;

public class IndividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name){
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
