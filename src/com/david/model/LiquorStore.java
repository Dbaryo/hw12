package com.david.model;

public class LiquorStore {
    public LiquorStore(String ownerName, Drink[] availableDrinks, double cashRegister) {
        this.ownerName = ownerName;
        this.availableDrinks = availableDrinks;
        this.cashRegister = cashRegister;
    }

    private String ownerName;
    private Drink [] availableDrinks;
    private double cashRegister;

    public void printAllAvailableDrinks(){
        System.out.println("The available drinks at " + ownerName +"s liquor store are:" );
        for (int i = 0; i < availableDrinks.length; i++) {
            System.out.println(availableDrinks[i]);
        }
    }


    public void  purchaseDrink ( String drink, int money ){
        boolean isAvailable = false;
        boolean isEnoughMoney = false;
        int i = 0;
        for ( i = 0 ; i < availableDrinks.length; i++) {
            if (drink.equals(availableDrinks[i].getDrinkName()) && availableDrinks[i].getInventory() > 0) {
                isAvailable = true;
                if (money >= availableDrinks[i].getDrinkPrice()) {
                    isEnoughMoney = true;
                }
            }
            break;
        }
            if ( isAvailable && isEnoughMoney ) {
                availableDrinks[i].setInventory(availableDrinks[i].getInventory() - 1);
                cashRegister += availableDrinks[i].getDrinkPrice();
            } else if (!isAvailable) {
                System.out.println("The drink: " + drink + " is unavailable.");
            } else if (isAvailable && !isEnoughMoney){
                System.out.println("You do not have enough money to buy drink " + drink);
            }


        }


}
