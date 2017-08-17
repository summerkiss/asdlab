package edu.mum.cs.asd.lab12.visitor;

public class PaperIFine implements IFine {
    private double fine;
    private double day;
    @Override
    public void accept(IFineVisitor visitor) {
        visitor.visit(this);
    }

    public PaperIFine(double fine, double day) {
        this.fine = fine;
        this.day = day;
    }

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
}
