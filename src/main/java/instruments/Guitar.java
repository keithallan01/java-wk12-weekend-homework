package instruments;

import interfaces.IPlay;

public class Guitar extends Strings implements IPlay {

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

}
