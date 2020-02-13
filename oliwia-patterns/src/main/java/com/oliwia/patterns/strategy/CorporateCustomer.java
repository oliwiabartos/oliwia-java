package com.oliwia.patterns.strategy;

import com.oliwia.patterns.strategy.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name){
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
