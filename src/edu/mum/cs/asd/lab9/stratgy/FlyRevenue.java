package edu.mum.cs.asd.lab9.stratgy;

import java.util.List;

public class FlyRevenue {
    private Model strategy;

    public void setStrategy(Model strategy){
            this.strategy = strategy;
    }

    public long getRevenue(List flight){
        return  strategy.getRevenue(flight);
       // System.currentTimeMillis();
    }
}
