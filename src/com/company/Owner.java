package com.company;

public class Owner {
    private String name;
    private String address;
    private int cnic;
    private String city;
    private String email;

    public void addRecord(String name, String address, int cnic, String city, String email) {
        setName(name);
        setAddress(address);
        setCity(city);
        setCnic(cnic);
        setEmail(email);
    }
    public void showRecord(){
        System.out.println(getName());
        System.out.println(getCity());
        System.out.println(getAddress());
        System.out.println(getCnic());
        System.out.println(getEmail());
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
