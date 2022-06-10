package com.company;

public class Commercial extends Property {
    private int sqfeet;
    private float price;
    private int parkingSpace;


    public void addRecord(String name, String address, int zip, String city, String description, int sqfeet, float price, int parkingSpace) {
        super.addRecord(name, address, zip, city, description);
        setPrice(price);
        setSqfeet(sqfeet);
        setParkingSpace(parkingSpace);
    }

    @Override
    public void showRecord() {
        super.showRecord();
        System.out.println(getSqfeet());
        System.out.println(getPrice());
        System.out.println(getParkingSpace());
    }

    @Override
    public void deleteRecord() {
        super.deleteRecord();
        setSqfeet(0);
        setParkingSpace(0);
        setPrice(0);
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "sqfeet=" + sqfeet +
                ", price=" + price +
                ", parkingSpace=" + parkingSpace +
                ", owner=" + owner +
                ", agent=" + agent +
                "} " + super.toString();
    }

    public int getSqfeet() {
        return sqfeet;
    }

    public void setSqfeet(int sqfeet) {
        this.sqfeet = sqfeet;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(int parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
}
