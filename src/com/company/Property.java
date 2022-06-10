package com.company;

import com.company.Agent;
import com.company.Owner;

public class Property {
    private String name;
    private String address;
    private int zip;
    private String city;
    private String description;
    Owner owner;
    Agent agent;

    public void addRecord(String name, String address, int zip, String city, String description) {
        setName(name);
        setAddress(address);
        setZip(zip);
        setCity(city);
        setDescription(description);
    }
    public void showRecord(){
        System.out.println(getName());
        System.out.println(getAddress());
        System.out.println(getZip());
        System.out.println(getCity());
        System.out.println(getDescription());
    }

    public void deleteRecord() {
        setName(null);
        setAddress(null);
        setZip(0);
        setCity(null);
        setDescription(null);
    }


    public void assignOwner(String name , String address,String city,String email, int cnic){
        owner= new Owner();
        owner.addRecord(name,address,cnic,city,email);
    }

    public void showOwner(){
        owner.showRecord();
    }

    public Owner getOwner() {
        return owner;
    }

    public Agent getAgent() {
        return agent;
    }

    public void assignAgent(String name , int fees, String city, String email, int cnic){
        agent = new Agent();
        agent.addRecord(name,fees,cnic,city,email);
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                ", description='" + description + '\'' ;
    }

    public void showAgent(){
        agent.showRecord();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
