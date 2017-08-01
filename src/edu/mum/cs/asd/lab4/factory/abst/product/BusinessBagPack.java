package edu.mum.cs.asd.lab4.factory.abst.product;

import edu.mum.cs.asd.lab4.factory.abst.product.AbstractBagPack;

public class BusinessBagPack extends AbstractBagPack {

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
