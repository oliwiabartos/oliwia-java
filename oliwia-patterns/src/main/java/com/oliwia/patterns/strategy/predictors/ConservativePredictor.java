package com.oliwia.patterns.strategy.predictors;

import com.oliwia.patterns.strategy.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy(){
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
