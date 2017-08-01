package edu.mum.cs.asd.lab2.adpter.twoway;

public interface Stack<E> {
    public E push(E item);
    public E pop();
    public E peek();
    public boolean empty();
    public int search(Object o);
}
