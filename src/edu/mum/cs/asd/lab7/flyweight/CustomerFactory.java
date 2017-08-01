package edu.mum.cs.asd.lab7.flyweight;

import edu.mum.cs.asd.lab7.flyweight.demo.Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CustomerFactory {
    private Map<Image,Customer> customers        = new HashMap<Image,Customer>();
    CustomerFactory(){}
    public Customer factory(Image locationMap){
        if(customers.get(locationMap)!=null){
            return customers.get(locationMap);

        }else{
            Customer customer = new ConcreteCustomer(locationMap);
            customers.put(locationMap,customer);
            return  customer;
        }

    }
}
