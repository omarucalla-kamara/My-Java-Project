package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class SpecialCake {

    String nameOfCake;
    double price;
    List<String> specialCakesArray = new ArrayList<>();


    public SpecialCake(String nameOfCake, double price, String specialCakesArray) {
        this.nameOfCake = nameOfCake;
        this.price = price;

    }

    public void addSpecialCakes(SpecialCake specialCake) {

        specialCakesArray.add(String.valueOf(specialCake));
    }
    public void listSpecialCake() {

        System.out.println(nameOfCake + price);
        System.out.println(specialCakesArray);
    }
    public String[][] specialCakeArray = new String[][] { {"Holiday", "25"},
            {"Birthday", "30"},
            {"Wedding", "50"},
            {"Anniversary", "40"}};

    @Override
    public double calculateCakeCost() {
        return super.calculateCakeCost();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void typeCake() {
        super.typeCake();
        System.out.println("Awesome Cake");
    }
    public void typeCustomCake() {
        System.out.println("I want a Special Cake!");
    }
}
