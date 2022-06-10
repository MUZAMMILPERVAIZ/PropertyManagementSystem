package com.company;

public class Agent {
    private String name;
    private int fees;
    private int cnic;
    private String city;
    private String email;

    public void addRecord(String name, int fees, int cnic, String city, String email) {
        setName(name);
        setFees(fees);
        setCity(city);
        setCnic(cnic);
        setEmail(email);
    }
    public void showRecord(){
        System.out.println(getName());
        System.out.println(getCity());
        System.out.println(getFees());
        System.out.println(getCnic());
        System.out.println(getEmail());
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", fees=" + fees +
                ", cnic=" + cnic +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getCnic() {
        return cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
