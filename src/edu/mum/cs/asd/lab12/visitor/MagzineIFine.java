package edu.mum.cs.asd.lab12.visitor;

public class MagzineIFine implements IFine {
    private double fine;
    private double day;

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public MagzineIFine(double fine, double day) {

        this.fine = fine;
        this.day = day;
    }

    @Override
    public void accept(IFineVisitor visitor) {
        visitor.visit(this);
    }
}
