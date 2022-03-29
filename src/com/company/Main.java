/*
Denise Chen
IS247-01
Business Inventory: Boba
Display supplies from a boba and tea factory
 */

package com.company;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Toppings> topArray = new ArrayList<Toppings>(3);     // Toppings arraylist
        ArrayList<Tea> teaArray = new ArrayList<Tea>(3);     // Tea arraylist

        Toppings tops = new Toppings(5001, "Boba", 100, 200,
                3.99, "sweet", true);
        Toppings tops2 = new Toppings(5002,"Lychee Jelly",200,200,
                3.00,"sweet", true);
        Toppings tops3 = new Toppings(5003,"Pudding",200,200,
                2.00,"sweet", true);

        Tea teas = new Tea(3001,"Black", 190,200,
                2.00,"yes","loose");
        Tea teas2 = new Tea(3002,"Green", 180, 200, 3.99,
                "yes", "bagged");
        Tea teas3 = new Tea(3003,"Earl Grey", 200,200, 3.99,
                "yes","loose");

        topArray.add(tops);         // adds toppings objects into arraylist
        topArray.add(tops2);
        topArray.add(tops3);

        teaArray.add(teas);         // adds toppings objects into arraylist
        teaArray.add(teas2);
        teaArray.add(teas3);

        System.out.println("--------  Sip Co. ----------");
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to view [enter a keyword]: " +
                "\n\t 1) toppings" +
                "\n\t 2) teas"
        );

        String user = input.nextLine();

        switch (user) {
            case "toppings":
                System.out.println(topArray.get(0).toString().replace("[", "").    // prints tops at an index
                        replace("]", "").replace(",","...."));
                System.out.println(topArray.get(1).toString().replace("[", "").    // prints tops2
                        replace("]", "").replace(",","...."));
                System.out.println(topArray.get(2).toString().replace("[", "").    // prints tops3
                        replace("]", "").replace(",","...."));
                break;
            case "teas":
                System.out.println(teaArray.get(0).toString().replace("[", "").    // prints teas
                        replace("]", "").replace(",","...."));
                System.out.println(teaArray.get(1).toString().replace("[", "").    // prints teas2
                        replace("]", "").replace(",","...."));
                System.out.println(teaArray.get(2).toString().replace("[", "").    // prints teas3
                        replace("]", "").replace(",","...."));
                break;
            default:
                System.out.println("Enter a valid keyword");
                break;
        }
    }
}