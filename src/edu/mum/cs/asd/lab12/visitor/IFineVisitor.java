package edu.mum.cs.asd.lab12.visitor;

public interface IFineVisitor {
    public void visit(BookIFine bf);

    public void visit(MagzineIFine mf);

    public void visit(PaperIFine pf);
}
