package edu.mum.cs.asd.lab7.builder;

public interface RequestBuilder {// builder interface
    public void retriveInformation(String phoneNumber);
    public void setRequestContent(String requestContent);
    public void setResponseContent(String responseContent);
    public void sendConsultation();
    public void setResult(boolean isAsw, boolean needCB);
}
