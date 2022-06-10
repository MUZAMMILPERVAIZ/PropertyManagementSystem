package com.company;

import com.company.Property;

public class Residential extends Property {
private int floors;
private String type;
private int parkingSpace;



    public void addRecord(String name, String address, int zip, String city, String description, int floors, String type, int parkingSpace) {
        super.addRecord(name, address, zip, city, description);
        setFloors(floors);
        setType(type);
        setParkingSpace(parkingSpace);
    }

    @Override
    public void showRecord() {
        super.showRecord();
        System.out.println(getFloors());
        System.out.println(getParkingSpace());
        System.out.println(getType());
    }

    @Override
    public void deleteRecord() {
        super.deleteRecord();
        setFloors(0);
        setType(null);
        setParkingSpace(0);
    }

    @Override
    public String toString() {
        return "Residential{" +
                "floors=" + floors +
                ", type='" + type + '\'' +
                ", parkingSpace=" + parkingSpace +
                ", owner=" + owner +
                ", agent=" + agent +
                "} " + super.toString();
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(int parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
}
