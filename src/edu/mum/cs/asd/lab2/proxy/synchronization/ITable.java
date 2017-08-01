package edu.mum.cs.asd.lab2.proxy.synchronization;

public interface ITable {
    public int numOfRows();
    public IRow getRow(int rowNum);
    public void addRow(IRow row, int rowNum); //add row at the end
    public void modifyRow(int rowNum, IRow row);
    public void deleteRow(int rowNum);
}
