package edu.mum.cs.asd.lab8.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    void add(Memento state) {
        mementoList.add(state);
    }

    Memento get(int index) {
        return mementoList.get(index);
    }
}
