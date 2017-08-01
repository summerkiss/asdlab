package edu.mum.cs.asd.lab7.flyweight.demo;

public class ConcreteFlyweight extends Flyweight {
    private Character intrinsicState = null;
    //构造函数，内部状态作为参数传入
    public ConcreteFlyweight(Character state)
    {
        this.intrinsicState = state;
    }
    //外部状态作为参数传入，改变方法的行为，但不改变对象的内部状态
    public void operation(String state)
    {
        System.out.println("Intrinsic State = " + intrinsicState + ",Extrinsic State = " + state);
    }
}
