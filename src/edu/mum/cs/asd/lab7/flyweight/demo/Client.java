package edu.mum.cs.asd.lab7.flyweight.demo;

public class Client {
    public static void main(String[] args)
    {
        //创建一个享元工厂对象
        FlyweightFactory factory = new FlyweightFactory();
        //向享元工厂对象请求一个内部状态为'a'的享元对象
        Flyweight fly = factory.factory(new Character('a'));
        //以参数方式传入一个外部状态
        fly.operation("First Call");
        //向享元工厂对象请求一个内部状态为'b'的享元对象
        fly = factory.factory(new Character('b'));
        //以参数方式传入一个外部状态
        fly.operation("Second Call");
        //向享元工厂对象请求一个内部状态为'a'的享元对象
        fly = factory.factory(new Character('a'));
        //以参数方式传入一个外部状态
        fly.operation("Third Call");

        //以上代码，虽然申请了3个享元对象，但是实际上只创建了两个，这就是共享的含义。
        //我们检查一下一个有几个对象
        factory.checkFlyweight();
    }
}
