package com.yearup;

public class CellPhone {

    private String serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(String serialNumber, String carrier, String phoneNumber, String owner, String model) {

        this.serialNumber = serialNumber;

        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;


    }
}
