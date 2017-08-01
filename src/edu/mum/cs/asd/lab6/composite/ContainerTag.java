package edu.mum.cs.asd.lab6.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContainerTag implements HtmlTag {
    private String name;
    private String context;

    public  ContainerTag(String name, String context){
        this.name = name;
        this.context = context;
    }

    List<HtmlTag> tags = new ArrayList<HtmlTag>();

    @Override
    public void append(HtmlTag tag) {
        tags.add(tag);
    }

    @Override
    public void remove(HtmlTag tag) {
        tags.remove(tag);
    }

    @Override
    public HtmlTag getChild(int i) {
        return tags.get(i);
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
        System.out.println(this.context);
        Iterator<HtmlTag> htmlIt = this.tags.iterator();
        while (htmlIt.hasNext()){
            htmlIt.next().print();
        }

        System.out.println("<"+this.name+"/>");

    }
}
