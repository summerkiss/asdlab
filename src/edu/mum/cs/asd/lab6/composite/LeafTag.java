package edu.mum.cs.asd.lab6.composite;

public class LeafTag implements HtmlTag {
    private String name;
    private String context;

    public  LeafTag(String name, String context){
        this.name = name;
        this.context = context;
    }

    @Override
    public void append(HtmlTag tag) {

    }

    @Override
    public void remove(HtmlTag tag) {

    }

    @Override
    public HtmlTag getChild(int i) {
        return null;
    }

    @Override
    public String getTagName() {
        return this.name;
    }

    @Override
    public String getContent() {
        return this.context;
    }

    @Override
    public void print() {
        System.out.print("<"+this.name+">");
        System.out.print(this.context);
        System.out.print("<"+this.name+"/>");



    }
}
