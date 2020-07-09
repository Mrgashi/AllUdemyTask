package com.udemy.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {

    private String type;
    private int hitPoints;
    private int strength;
    private String specialAttack;

    public Monster(String type, int hitPoints, int strength) {
        this.type = type;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.specialAttack = "Super EAT!!";
    }

    @Override
    public String toString() {
        return "Monster{" +
                "type='" + type + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", specialAtack='" + specialAttack + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

    @Override
    public List<String> write() {
        List<String> monsterValues = new ArrayList<String>();
        monsterValues.add(0, this.type);
        monsterValues.add(1, "" + this.hitPoints);
        monsterValues.add(2, "" + this.strength);
        monsterValues.add(3, this.type);
        return monsterValues;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.type = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.specialAttack = savedValues.get(3);
        }

    }
}
