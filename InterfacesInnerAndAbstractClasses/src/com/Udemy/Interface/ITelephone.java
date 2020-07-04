package com.Udemy.Interface;

public interface ITelephone {
    void PowerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
