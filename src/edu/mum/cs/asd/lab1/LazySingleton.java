package edu.mum.cs.asd.lab1;

public class LazySingleton implements Runnable{
    private LazySingleton(){
        System.out.println("LazySingleton is create");
    }
    private static LazySingleton instance = null;
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    public static void createString(){
        System.out.println("create String");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        long beginTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            LazySingleton.getInstance();
        }
        System.out.println(System.currentTimeMillis() - beginTime);
    }

    public static void main(String[] args){
        //LazySingleton.createString();
        for(int i=0;i<5;i++){
            new Thread(new LazySingleton()).start();
        }
    }

}