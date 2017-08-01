package edu.mum.cs.asd.lab1;

public class DCLSingleton {
    private volatile static DCLSingleton singleton;
    private DCLSingleton (){}
    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
