package edu.mum.cs.asd.lab7.flyweight;

public abstract class Customer {
    public abstract void operate(String id,
                                 String firstName,
                                 String lastName,
                                 Address address,
                                 HealthProfile healthProfile);
}
