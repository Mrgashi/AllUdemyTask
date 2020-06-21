package com.Udemy;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have: " + groceryList.size() + " items in your groceryList");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItems(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItems(position, newItem);
        }
    }
    private void modifyGroceryItems(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("GroceryItem " + (position + 1) + " has been updated. ");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
