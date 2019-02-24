package instruments;

public class Instrument {

    private String material;
    private double costPrice;

    public Instrument(String material, double costPrice) {
        this.material = material;
        this.costPrice = costPrice;
    }

    public String getMaterial() {
        return material;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

}
