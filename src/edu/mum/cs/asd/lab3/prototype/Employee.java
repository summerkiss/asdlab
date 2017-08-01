package edu.mum.cs.asd.lab3.prototype;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = this.staff;
    }

    private Employee staff[];
    @Override
    protected Object clone(){return null;}

    public Employee deeClone(){
        try {
            Employee clone = (Employee) super.clone();
            if(this.supervisor!=null){
                clone.supervisor = this.supervisor.deeClone();
            }
            if(this.staff!=null){
                clone.staff = new Employee[this.staff.length];
                for (int i = 0; i < clone.staff.length; i++) {
                    clone.staff[i] = this.staff[i].deeClone();
                }
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public  static void main(String args[]){
            Employee e = new Employee();
            e.setId(1);
            e.setLastname("aaaa");

            Employee s = new Employee();
            s.setId(0);
            s.setLastname("ssss");

            e.setSupervisor(s);

            Employee b = new Employee();
            b.setId(2);
            b.setLastname("bbbb");

            Employee staff[] = {b};
            e.setStaff(staff);

            Employee c = e.deeClone();
    }

}
