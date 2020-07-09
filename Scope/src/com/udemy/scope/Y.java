package com.udemy.scope;

public class Y {
    private int y;

    public Y(int y) {
        this.y = y;
    }

    public void y() {
        for (int y = 0; y <= 10; y++) {
            System.out.println(y + " times " + this.y + " equals " + y * this.y);
        }
    }
}
