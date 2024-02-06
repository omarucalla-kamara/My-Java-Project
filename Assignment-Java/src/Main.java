import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                Cake[] c = new Cake[5];

                for (int i = 0; i < 5; i++) {
                    int cakeId = sc.nextInt();
                    sc.nextLine();
                    String cakeName = sc.nextLine();

                    int pound = sc.nextInt();
                    double pricePerPound = sc.nextDouble();
                    boolean eggless = sc.nextBoolean();

                    Cake cake = new Cake(cakeId, cakeName, pound, pricePerPound, eggless);
                    c[i] = cake;
                }
                double bill = generateBill(c);
                System.out.println(bill);

                Cake[] temp = new Cake[getEgglessCount(c)];
                System.out.println("Count is " + getEgglessCount(c));
                temp = getEgglessCake(c);
        for (Cake cake : temp) {
            System.out.println(cake.getCakeId());
            System.out.println(cake.getCakeName());
        }
    }

    public static double generateBill(Cake[] c) {
        double price = 0, count = 0;
        for (Cake cake : c) {
            price += cake.getPricePerPound();
            if (cake.isEggless()) {
                count++;
            }
        }
        price += (count * 50);
        price += (.02 * price);
        return price;
    }

    public static Cake[] getEgglessCake(Cake[] c) {
        int egglesscnt = 0;
        for (Cake value : c) {
            if (value.isEggless()) {
                egglesscnt++;
            }
        }
        Cake[] cake = new Cake[egglesscnt];
        for (int i = 0, j = 0; i < c.length; i++) {
            if (c[i].isEggless()) {
                cake[j] = c[i];
                j++;
            }
        }
        return cake;
    }

    public static int getEgglessCount(Cake[] c) {
        int egglesscnt = 0;
        for (Cake cake : c) {
            if (cake.isEggless()) {
                egglesscnt++;
            }
        }
        return egglesscnt;
    }
}
