package edu.mum.cs.asd.lab7.builder;

import org.omg.CORBA.CustomMarshal;

public class CommonRequestBuilder implements  RequestBuilder {
    private Customer c ;
    private Request req;
    @Override
    public void retriveInformation(String phoneNumber) {


        if(phoneNumber == null){
            c = new Customer();
        }
        req = new Request();
        req.setRequester(c);
    }

    @Override
    public void setRequestContent(String requestContent) {
        req.setReqContent(requestContent);
    }

    @Override
    public void setResponseContent(String responseContent) {
        req.setRespContent(responseContent);
    }

    @Override
    public void sendConsultation() {

    }

    @Override
    public void setResult(boolean isAsw, boolean needCB) {
        req.setAnswered(isAsw);
        req.setNeedCallBack(needCB);
    }

    public Request getRequest(){
        return this.req;
    }
}
