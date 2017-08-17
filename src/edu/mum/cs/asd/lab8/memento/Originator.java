package edu.mum.cs.asd.lab8.memento;

public class Originator {
    private String externalizedState;

    String getExternalizedState() {
        return externalizedState;
    }

    void setExternalizedState(String externalizedState) {
        this.externalizedState = externalizedState;
    }

    public Memento saveStateToMemento() {
        return new Memento(externalizedState);
    }

    public void getStateFromMemento(Memento Memento) {
        externalizedState = Memento.getState();
    }
}
