package edu.mum.cs.asd.lab9.stratgy;

import java.util.List;

public interface Model {
    public static final long BASE_PRICE = 300;
    public static final long FLY_COST = 50000;

    public long getRevenue(List flights);
}
