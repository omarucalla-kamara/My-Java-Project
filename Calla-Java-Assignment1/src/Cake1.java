public class Cake1 {

    private String caketype;
    private double price;
    private int layer;
    private int size;

    public Cake1() {
    }

    public Cake1(String caketype, double price, int layer, int size) {
        this.caketype = caketype;
        this.price = price;
        this.layer = layer;
        this.size = size;
    }

    public String getCaketype() {
        return caketype;
    }

    public void setCaketype(String cakeype) {
        this.caketype = caketype;
    }

    public double getPrice() {
        price = size + layer;
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cake1{" +
                "caketype='" + caketype + '\'' +
                ", price=" + price +
                ", layer=" + layer +
                ", size=" + price +
                '}';
    }
}


class NormalCake extends Cake1{
    private String colour;

    public NormalCake(String cakeType, double price, int layer, int size, String colour) {
        super(cakeType, price, layer, size);
        this.colour = colour;
    }

    public void normalCakeCost(double totalCost) {
        totalCost = getPrice();

    }
}