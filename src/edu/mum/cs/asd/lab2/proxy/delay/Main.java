package edu.mum.cs.asd.lab2.proxy.delay;

public class Main {
    public static void main(String[] args){
        IDBQuery q = new DBQueryProxy(); //使用代里
        q.request(); //在真正使用时才创建真实对象
    }
}
