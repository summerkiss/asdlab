package edu.mum.cs.asd.lab10.mediator;

public class PositionImpl extends Position{
    public PositionImpl(ReverseMediator mediator, int x, int y, Color c) {
        super(mediator, x, y, c);
    }

    @Override
    public void send(int x, int y, Color c) {
        //mediator.sendMessage();
    }

    @Override
    public void recieve(Color c) {

    }
}
