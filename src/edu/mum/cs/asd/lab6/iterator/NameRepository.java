package edu.mum.cs.asd.lab6.iterator;

public class NameRepository implements Aggregate{
    private String names[][] = {{"Rob", "Jon" ,"Jul"} ,
            {"Lor", "Pat", "Ken"},
            {"Min", "Guo", "Xia" }};

    @Override
    public Iterator getIterator() {
        return null;
    }

    private class NameIterator implements Iterator {


        int rowIdx;
        int colIdx;
        @Override
        public boolean hasNext() {
            if(rowIdx<names.length&&colIdx < names[rowIdx].length){
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                if(colIdx+1<names[rowIdx].length){
                    return names[colIdx++][rowIdx];
                }else{
                    return names[colIdx++][rowIdx++];
                }
            }
            return null;
        }
    }
}
