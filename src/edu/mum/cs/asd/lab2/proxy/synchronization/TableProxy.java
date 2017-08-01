package edu.mum.cs.asd.lab2.proxy.synchronization;

public class TableProxy implements ITable{

    IRow rows[];
    ITable table;

    public TableProxy(Table t){
        table = t;
        for(int i=0;i< t.numOfRows();i++){
            rows[i] = t.getRow(i);
        }
    }

    @Override
    public int numOfRows() {
        return table.numOfRows();
    }

    @Override
    public IRow getRow(int rowNum) {
        synchronized(rows[rowNum]){
            return rows[rowNum];
        }

    }

    @Override
    public void addRow(IRow row, int rowNum) {
        synchronized(table){
            table.addRow(row,rowNum);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        synchronized(rows[rowNum]){
            rows[rowNum] = row;
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        synchronized(table){
            table.deleteRow(rowNum);
        }
    }
}
