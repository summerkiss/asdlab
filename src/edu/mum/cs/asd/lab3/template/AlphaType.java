package edu.mum.cs.asd.lab3.template;

public enum AlphaType {
    VERTICAL("VERTICAL"),
    NONE("NONE"),
    HORIZONTAL("HORIZONTAL");

    private String type;


    AlphaType(String s){
        this.type =s;
    }

    public String type(){
        return  type;
    }
}

