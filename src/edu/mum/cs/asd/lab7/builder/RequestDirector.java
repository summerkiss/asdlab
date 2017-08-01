package edu.mum.cs.asd.lab7.builder;

public class RequestDirector {
    private CommonRequestBuilder builder = null;

    public  RequestDirector(CommonRequestBuilder builder ){
        this.builder = builder;
    }

    public void constructRequest(){
        builder.setRequestContent("");
    }

    public Request getRequest(){
        return  builder.getRequest();

    }

}
