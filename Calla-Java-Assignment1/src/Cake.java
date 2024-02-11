public class Cake {
//Encapsulation
    private String flavour;

    public Cake() {
    }

    public Cake(String flavour) {
        this.flavour = flavour;
    }

    public double calculateCakeCost() {
        return calculateCakeCost();
    }

    public void typeCake() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(flavour + " is a " + instanceType);
    }
    public static Cake getCake(String type, String flavour, int layers, int size,
                               String nameOfCake, double price, String specialCakeArray) {

        //Control flow
        return switch (type.toUpperCase().charAt(0)) {
            case 'C' -> new CustomCake(flavour, layers, size);
            case 'S' -> new SpecialCake(flavour, price, specialCakeArray);
            default -> new Cake(flavour);
        };
    }
}
// Inheritance
class CustomCake extends Cake{
    int layers;
    int size;

    public CustomCake(String flavour, int layers, int size) {

        super(flavour);
        this.layers = layers;
        this.size = size;
    }

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
        System.out.println("Nice Cake");
    }
    public void typeCustomCake() {
        System.out.println("I want a Custom Cake!");
    }
}

class SpecialCake extends Cake {

    String nameOfCake;
    double price;
    String specialCakesArray;


    public SpecialCake(String nameOfCake, double price, String specialCakesArray) {
        this.nameOfCake = nameOfCake;
        this.price = price;
        this.specialCakesArray = specialCakesArray;
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
