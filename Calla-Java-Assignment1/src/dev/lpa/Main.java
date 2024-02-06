package dev.lpa;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Cake theCake = Cake.getCake("Custom", "Strawberry", 2, 6, "Birthday", 25,"Birthday");
//        theCake.typeCake();

        Scanner c = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (C for Custom Cake, S for Special Cake, "
                    + " or Q to quit): ");
            String type = c.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Cake Flavour");
            String flavour = c.nextLine();
            int layers = 0;
            int size = 0;
            String nameOfCake = new String();
            double price = 0;
            String specialCakeArray = new String();
            Cake cake = Cake.getCake(type, flavour, layers, size, nameOfCake, price, specialCakeArray);
            cake.typeCake();
        }






    }

//    public static void cakeMenu(Cake1 cake1) {
//
//        System.out.println("Your Ordered Cake is: " + cake1.toString());






//        Scanner scanner = new Scanner(System.in);
//        System.out.println("***** Welcome to ADRIMA'S TASTE AND BITE Cake Home *****");
//        int numberOfCakes = scanner.nextInt();
//        System.out.println("How many cakes would you like to order?");
//
//        System.out.println("Enter the type of cake you want");
    }

