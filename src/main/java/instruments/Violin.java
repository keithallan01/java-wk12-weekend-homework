package instruments;

import interfaces.IPlay;

public class Violin extends Strings implements IPlay {

    private String manufacturer;
    private int year;

    public Violin(int numOfStrings, String manufacturer, int year) {
        super(numOfStrings);
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play(){
        return "Sqweek sqweek, I'm playing the fidley diddle";
    }
}
