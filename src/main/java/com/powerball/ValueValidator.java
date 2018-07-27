package com.powerball;

import java.util.List;

public class ValueValidator {

    private List<Integer> combination;

    ValueValidator(List<Integer> combination){
        this.combination = combination;
    }

    private boolean isRed(int i) {
        return ( (i == 5) && (combination.get(i) >= 1) && (combination.get(i) <= 26) );
    }

    private boolean isWhite(int i) {
        return ( (i >= 0) && (i < 5) && (combination.get(i) >= 1) && (combination.get(i) <= 69) );
    }

    public boolean isValid(int i){
        return ( isRed(i) || isWhite(i) );
    }
}
