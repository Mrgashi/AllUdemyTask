package com.udemy.scope;

public class X {
    private final int x;

    public X(int x) {
        this.x = x;
        System.out.println("X class created.");
    }

    public void x(){
        for (int x = 0; x <= 12; x++) {
            System.out.println(this.x * x);
        }
    }
}
