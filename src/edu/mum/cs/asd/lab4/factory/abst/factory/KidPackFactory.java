package edu.mum.cs.asd.lab4.factory.abst.factory;

import edu.mum.cs.asd.lab4.factory.abst.product.AbstractBagPack;
import edu.mum.cs.asd.lab4.factory.abst.product.AbstractBoxPack;
import edu.mum.cs.asd.lab4.factory.abst.product.AbstractWarpPack;

public class KidPackFactory implements PackageFactory {
    @Override
    public AbstractBagPack getBagPack() {
        return null;
    }

    @Override
    public AbstractBoxPack getBoxPack() {
        return null;
    }

    @Override
    public AbstractWarpPack getWarpPack() {
        return null;
    }
}
