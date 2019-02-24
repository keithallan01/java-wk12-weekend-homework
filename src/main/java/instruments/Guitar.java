package instruments;

import interfaces.IPlay;

public class Guitar extends Strings implements IPlay {

    private String make;
    private String model;

    public Guitar(int numOfStrings, String make, String model) {
        super(numOfStrings);
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
