package edu.mum.cs.asd.lab12.visitor;

import java.util.List;

public class FineCalculator {
    private List<IFine> fineList;

    public double calculateStudentFine(){
        StudentIFineVisitor visitor = new StudentIFineVisitor();
        for(IFine fine : fineList){
            fine.accept(visitor);
        }
        return  visitor.getTotalFine();
    }
}
