import dev.lpa.CustomCake;
import dev.lpa.SpecialCake;

public abstract class Cake {
//Encapsulation
    private String flavour;

    public Cake() {
    }

    public Cake(String flavour) {
        this.flavour = flavour;
    }

    public abstract void calculateCakeCost(double cost);

    @Override
    public abstract String toString();

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
