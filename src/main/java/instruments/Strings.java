package instruments;

public abstract class Strings extends Instrument{

    public int numOfStrings;

    public Strings(String material, double costPrice, int numOfStrings) {
        super(material, costPrice);
        this.numOfStrings = numOfStrings;
    }
}
