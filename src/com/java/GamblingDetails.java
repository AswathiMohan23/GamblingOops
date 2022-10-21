package com.java;

public class GamblingDetails {
   private final int stake=100; // in dollars
   private final int bet=1;    //in dollars

    public int getStake() {
        return stake;
    }
    public int getBet() {
        return bet;
    }

    @Override
    public String toString() {
        return "GamblingDetails{" +
                "stake=" + stake +
                ", bet=" + bet +
                '}';
    }
}
