package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("12345", "Sprint","551-222-2222", "Raquan", "Iphone 11");
        System.out.printf("%s belongs to %s", phone.getPhoneNumber(),phone.getOwner());


    }
}

