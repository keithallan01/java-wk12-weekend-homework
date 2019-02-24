package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Guitar extends Strings implements IPlay, ISell {

    private String make;
    private String model;

    public Guitar(String material, double costPrice, int numOfStrings, String make, String model, String material1) {
        super(material, costPrice, numOfStrings);
        this.make = make;
        this.model = model;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumOfStrings(){
        return numOfStrings;
    }

    public String play(){
        return "Twang, I'm playing the guitar";
    }

    public double calculateMarkUp(){
        return getCostPrice() * 1.5;
    }

}
