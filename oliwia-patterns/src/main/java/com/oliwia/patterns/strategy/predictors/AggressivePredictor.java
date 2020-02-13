package com.oliwia.patterns.strategy.predictors;

import com.oliwia.patterns.strategy.BuyPredictor;

public class AggressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy(){
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
