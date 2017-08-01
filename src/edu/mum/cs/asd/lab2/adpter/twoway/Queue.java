package edu.mum.cs.asd.lab2.adpter.twoway;

public interface Queue<E> {
    public boolean add(E e);
    public boolean offer(E e);
    public E remove();
    public E poll();
    public E element();
    public E peek();
}
