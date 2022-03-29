package com.company;

public class Tea extends Label {      // subclass

    private String type;        // type of tea
    private String caffeinated; // caffeine
    private String leaves;      // loose leaves or not

    Tea(){

    }

    Tea(int id,  String type2, int countItem, int supplyLevel, double price, String caffeinated2, String leaves2) {
        super(id, countItem, supplyLevel, price);           // using Label attributes
        this.type = type2;
        this.caffeinated = caffeinated2;
        this.leaves = leaves2;
    }

    public String toString () {
        return "ID: " + this.id + "...." + "Tea type: " + this.type + " tea" + "...." + "In stock: " +
                this.countItem + " out of "+ this.supplyLevel + "...." + "$" + this.price+ " per bag" +
                "...." + "Caffeinated?: " + this.caffeinated + "...." + "Loose or bagged?: " + this.leaves;
    }
}