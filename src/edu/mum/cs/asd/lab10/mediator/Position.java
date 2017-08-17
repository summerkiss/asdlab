package edu.mum.cs.asd.lab10.mediator;

public abstract class Position {
    ReverseMediator mediator;
    int x;
    int y;
    Color color = Color.NONE;

    public Position(ReverseMediator mediator,int x, int y, Color c){
        this.mediator = mediator;
        this.x = x;
        this.y = y;
        this.color = c;
    }

    public abstract void send(int x, int y, Color c);
    public abstract void recieve(Color c);

}
