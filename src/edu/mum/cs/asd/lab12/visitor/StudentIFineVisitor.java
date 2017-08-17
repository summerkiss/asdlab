package edu.mum.cs.asd.lab12.visitor;

public class StudentIFineVisitor implements IFineVisitor {
    private double totalFine =0.0;
    @Override
    public void visit(BookIFine bf) {
        totalFine += bf.getFine()*bf.getDay();
    }

    @Override
    public void visit(MagzineIFine mf) {
        totalFine += mf.getFine()*mf.getDay();
    }

    @Override
    public void visit(PaperIFine pf) {
        totalFine += pf.getFine()*pf.getDay();
    }

    public double getTotalFine() {
        return  totalFine>10?10:totalFine;
    }
}
