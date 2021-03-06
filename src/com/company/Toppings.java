package com.company;

public class Toppings extends Label {     // subclass

    private String name;    // topping name
    private String sweet;   // sweetness level
    private boolean chewy;   // chewiness

    Toppings() {
    }

    Toppings(int id2, String name2, int countItem, int supplyLevel, double price, String sweet2, boolean chewy2) {
        super(id2, countItem, supplyLevel, price);              // using Label attributes
        this.name = name2;
        this.sweet = sweet2;
        this.chewy = chewy2;
    }

    public String toString() {
        return "ID: " + this.id + "...." + "Topping name: " + this.name + "...." + "In stock: "
                + this.countItem + " out of " + this.supplyLevel + "...." + "$" + this.price + " per bag" +
                "...." + "Sweetened?: " + this.sweet + "...." + "Chewy?: " + this.chewy;
    }
}