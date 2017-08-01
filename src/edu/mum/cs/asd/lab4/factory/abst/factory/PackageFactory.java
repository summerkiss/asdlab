package edu.mum.cs.asd.lab4.factory.abst.factory;

import edu.mum.cs.asd.lab4.factory.abst.product.AbstractBagPack;
import edu.mum.cs.asd.lab4.factory.abst.product.AbstractBoxPack;
import edu.mum.cs.asd.lab4.factory.abst.product.AbstractWarpPack;

public interface PackageFactory {
    public abstract AbstractBagPack getBagPack();
    public abstract AbstractBoxPack getBoxPack();
    public abstract AbstractWarpPack getWarpPack();
}
