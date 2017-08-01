package edu.mum.cs.asd.lab7.flyweight.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlyweightFactory {
    private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
    private Flyweight lnkFlyweight;
    public FlyweightFactory() {}
    public Flyweight factory(Character state)
    {
        if(files.containsKey(state))
        {
            return files.get(state);
        } else{
            Flyweight fly = new ConcreteFlyweight(state);
            files.put(state,fly);
            return fly;
        }
    }
    //辅助方法
    public void checkFlyweight()
    {
        Flyweight fly;
        int i = 0;
        System.out.println("\n======checkFlyweight()======begin");
        for(Iterator it = files.entrySet().iterator(); it.hasNext();)
        {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("Item " + (++i) + ":" + e.getKey());
        }
        System.out.println("======checkFlyweight()======end");
    }
}
