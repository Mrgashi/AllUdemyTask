package com.udemy.LinkedList;

public class Song {
    private String title;
    private double duartion;

    public Song(String title, double duartion) {
        this.title = title;
        this.duartion = duartion;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duartion;
    }
}
