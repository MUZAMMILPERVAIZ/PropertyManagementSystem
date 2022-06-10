package com.company;

import com.company.Commercial;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 1;
        while (choice != 0) {

            System.out.println("Enter 1 for residential property");
            System.out.println("Enter 2 for commercial property");
            System.out.println("Enter 0 to quit");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How many record you want to enter:");
                    int recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Residential> residentials = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        choice=90; // some other no than 0 and 8
                        while (choice != 8) {
                            System.out.println("Enter 1 for adding property record");
                            System.out.println("Enter 2 for showing property record");
                            System.out.println("Enter 3 for adding owner record");
                            System.out.println("Enter 4 for showing owner record");
                            System.out.println("Enter 5 for adding agent record");
                            System.out.println("Enter 6 for showing showing record");
                            System.out.println("Enter 7 for deleting property record");
                            System.out.println("Enter 8 to quit");
                            choice = new Scanner(System.in).nextInt();
                            switch (choice) {
                                case 1:
                                    residentials.add(i,new Residential());
                                    System.out.println("enter name:");
                                    String name = new Scanner(System.in).next();
                                    System.out.println("enter address:");
                                    String address = new Scanner(System.in).next();
                                    System.out.println("enter zip:");
                                    int zip = new Scanner(System.in).nextInt();
                                    System.out.println("enter description:");
                                    String description = new Scanner(System.in).next();
                                    System.out.println("enter cnic:");
                                    int cnic = new Scanner(System.in).nextInt();
                                    System.out.println("enter floors:");
                                    int floors = new Scanner(System.in).nextInt();
                                    System.out.println("enter type:");
                                    String type = new Scanner(System.in).next();
                                    System.out.println("enter city:");
                                    String city = new Scanner(System.in).next();
                                    System.out.println("enter parking space:");
                                    int parkingSpace = new Scanner(System.in).nextInt();
//                            System.out.println("enter email:");
//                            String email = new Scanner(System.in).next();
                                    residentials.get(i).addRecord(name, address, zip, city, description, floors, type, parkingSpace);
                                    break;
                                case 2:
                                    residentials.get(i).showRecord();
                                    break;
                                case 3:
                                    System.out.println("enter name:");
                                    name = new Scanner(System.in).next();
                                    System.out.println("enter address:");
                                    address = new Scanner(System.in).next();
                                    System.out.println("enter cnic:");
                                    cnic = new Scanner(System.in).nextInt();
                                    System.out.println("enter city:");
                                    city = new Scanner(System.in).next();
                                    System.out.println("enter email:");
                                    String email = new Scanner(System.in).next();
                                    residentials.get(i).assignOwner(name, address, city, email, cnic);
                                    break;
                                case 4:
                                    residentials.get(i).showOwner();
                                    break;
                                case 5:
                                    System.out.println("enter name:");
                                    name = new Scanner(System.in).next();
                                    System.out.println("enter fees:");
                                    int fees = new Scanner(System.in).nextInt();
                                    System.out.println("enter cnic:");
                                    cnic = new Scanner(System.in).nextInt();
                                    System.out.println("enter city:");
                                    city = new Scanner(System.in).next();
                                    System.out.println("enter email:");
                                    email = new Scanner(System.in).next();
                                    residentials.get(i).assignAgent(name, fees, city, email, cnic);
                                    break;
                                case 6:
                                    residentials.get(i).showAgent();
                                    break;
                                case 7:
                                    residentials.get(i).deleteRecord();
                                    break;

                            }

                        }


                        System.out.println();
                    }
             break;
                case 2:
                    System.out.println("How many record you want to enter:");
                     recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Commercial> commercials = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        choice=90; // some other no than 0 and 8
                        while (choice != 8) {
                            System.out.println("Enter 1 for adding property record");
                            System.out.println("Enter 2 for showing property record");
                            System.out.println("Enter 3 for adding owner record");
                            System.out.println("Enter 4 for showing owner record");
                            System.out.println("Enter 5 for adding agent record");
                            System.out.println("Enter 6 for showing showing record");
                            System.out.println("Enter 7 for deleting property record");
                            System.out.println("Enter 8 to quit");
                            choice = new Scanner(System.in).nextInt();
                            switch (choice) {
                                case 1:
                                    commercials.add(i,new Commercial());
                                    System.out.println("enter name:");
                                    String name = new Scanner(System.in).next();
                                    System.out.println("enter address:");
                                    String address = new Scanner(System.in).next();
                                    System.out.println("enter zip:");
                                    int zip = new Scanner(System.in).nextInt();
                                    System.out.println("enter description:");
                                    String description = new Scanner(System.in).next();
                                    System.out.println("enter cnic:");
                                    int cnic = new Scanner(System.in).nextInt();
                                    System.out.println("enter sqfeet:");
                                    int sqfeet = new Scanner(System.in).nextInt();
                                    System.out.println("enter price:");
                                    float price = new Scanner(System.in).nextFloat();
                                    System.out.println("enter city:");
                                    String city = new Scanner(System.in).next();
                                    System.out.println("enter parking space:");
                                    int parkingSpace = new Scanner(System.in).nextInt();
//                            System.out.println("enter email:");
//                            String email = new Scanner(System.in).next();
                                    commercials.get(i).addRecord(name, address, zip, city, description, sqfeet, price, parkingSpace);
                                    break;
                                case 2:
                                    commercials.get(i).showRecord();
                                    break;
                                case 3:
                                    System.out.println("enter name:");
                                    name = new Scanner(System.in).next();
                                    System.out.println("enter address:");
                                    address = new Scanner(System.in).next();
                                    System.out.println("enter cnic:");
                                    cnic = new Scanner(System.in).nextInt();
                                    System.out.println("enter city:");
                                    city = new Scanner(System.in).next();
                                    System.out.println("enter email:");
                                    String email = new Scanner(System.in).next();
                                    commercials.get(i).assignOwner(name, address, city, email, cnic);
                                    break;
                                case 4:
                                    commercials.get(i).showOwner();
                                    break;
                                case 5:
                                    System.out.println("enter name:");
                                    name = new Scanner(System.in).next();
                                    System.out.println("enter fees:");
                                    int fees = new Scanner(System.in).nextInt();
                                    System.out.println("enter cnic:");
                                    cnic = new Scanner(System.in).nextInt();
                                    System.out.println("enter city:");
                                    city = new Scanner(System.in).next();
                                    System.out.println("enter email:");
                                    email = new Scanner(System.in).next();
                                    commercials.get(i).assignAgent(name, fees, city, email, cnic);
                                    break;
                                case 6:
                                    commercials.get(i).showAgent();
                                    break;
                                case 7:
                                    commercials.get(i).deleteRecord();
                                    break;
                            }

                        }


                        System.out.println();
                    }






                    break;
            }
        }
    }
}