package com.david.model;

public class Drink {
    public Drink(String drinkName, float drinkPrice, int inventory) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.inventory = inventory;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public float getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(float drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    private String drinkName;
    private float drinkPrice;
    private int inventory;
}
