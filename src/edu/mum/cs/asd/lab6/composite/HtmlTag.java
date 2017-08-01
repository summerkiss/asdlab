package edu.mum.cs.asd.lab6.composite;

public interface HtmlTag {
    public void append(HtmlTag tag);
    public void remove(HtmlTag tag);
    public HtmlTag getChild(int i);
    public String getTagName();
    public String getContent();
    public void print();
}
