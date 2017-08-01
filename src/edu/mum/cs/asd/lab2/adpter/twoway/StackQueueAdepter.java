package edu.mum.cs.asd.lab2.adpter.twoway;

import java.util.Vector;

public class StackQueueAdepter implements Queue, Stack {
    private Vector adaptee;

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object push(Object item) {
        adaptee.addElement(item);
        return item;
    }

    @Override
    public Object pop() {
        Object o = adaptee.get(adaptee.size());
        adaptee.remove(o);
        return o;
    }

    @Override
    public Object peek() {
        Object o = adaptee.get(adaptee.size());
        return o;
    }

    @Override
    public boolean empty() {
        return (adaptee == null || adaptee.size() == 0) ? true : false;
    }

    @Override
    public int search(Object o) {
       if(!adaptee.contains(o)){
           return 0;
       }else{
           int i = adaptee.indexOf(o);
           return adaptee.size() -i +1;
       }
    }
}
