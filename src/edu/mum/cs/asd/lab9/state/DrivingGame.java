package edu.mum.cs.asd.lab9.state;

public class DrivingGame {
    private GameState currentState;




    public DrivingGame(GameState state) {
        this.currentState = state;
    }

    public void setGravel() {

        currentState = new GravelState();
    }

    public void turnLeft(){
        currentState.left();
    }

    public void turnRight(){
        currentState.right();
    }

    public void setState(GameState state) {
        this.currentState = state;
    }

    public void setRegular() {
        currentState = new RegularState();
    }

    public void setWet() {
        currentState = new WetState();
    }

    public void setIce() {
        currentState = new IceState();
    }
}
