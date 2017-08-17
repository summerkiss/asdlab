package edu.mum.cs.asd.lab10.mediator;

import java.util.List;

public class ReverseMediatorImpl implements  ReverseMediator {
    Position[][] ps = new Position[8][8];
    @Override
    public void sendMessage(Color c, Position p) {


    }

    @Override
    public void addPosition(Position p) {
        if(p!=null&&!p.color.equals(Color.NONE)){
            ps[p.x][p.y] = p ;
        }

    }

    //private List<Position> get
}
