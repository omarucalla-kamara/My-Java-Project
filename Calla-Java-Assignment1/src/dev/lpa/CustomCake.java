package dev.lpa;

public class CustomCake extends Cake {

    int layers;
    int size;

    public CustomCake(String flavour, int layers, int size) {

        super(flavour);
        this.layers = layers;
        this.size = size;
    }

//    @Override
//    public double calculateCakeCost() {
//
//        return super.calculateCakeCost();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//    @Override
//    public void typeCake() {
//        super.typeCake();
//        System.out.println("Nice Cake");
//    }
//    public void typeCustomCake() {
//        System.out.println("I want a Custom Cake!");
//    }
}

