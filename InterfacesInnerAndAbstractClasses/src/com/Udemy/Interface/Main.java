package com.Udemy.Interface;

public class Main {
    public static void main(String[] args) {

        ITelephone deskphone = new DeskPhone(3222);
        deskphone.PowerOn();
        deskphone.callPhone(3222);
        deskphone.isRinging();
        deskphone.answer();

        deskphone = new MobilePhone(2332);
        deskphone.PowerOn();
        deskphone.callPhone(2332);
        deskphone.answer();

    }
}
