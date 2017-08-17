package edu.mum.cs.asd.lab12.visitor;

public class BookIFine implements IFine {
    private double fine;
    private double day;

    public double getFine() {
        return fine;
    }

    public BookIFine(double fine, double day) {
        this.fine = fine;
        this.day = day;
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

    @Override
    public void accept(IFineVisitor visitor) {

        visitor.visit(this);
    }
}
