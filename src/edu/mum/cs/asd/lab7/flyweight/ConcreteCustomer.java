package edu.mum.cs.asd.lab7.flyweight;


import java.awt.*;

public class ConcreteCustomer extends Customer {
    private Image locationMap;

    public ConcreteCustomer(Image locationMap){
        this.locationMap = locationMap;
    }

    @Override
    public void operate(String id, String firstName, String lastName, Address address, HealthProfile healthProfile) {

    }
}
