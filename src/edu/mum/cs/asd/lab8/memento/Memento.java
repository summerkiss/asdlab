package edu.mum.cs.asd.lab8.memento;

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }
}
