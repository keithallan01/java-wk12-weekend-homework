package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Violin extends Strings implements IPlay, ISell {

    private String manufacturer;
    private int year;

    public Violin(String material, double costPrice,  int numOfStrings, String manufacturer, int year) {
        super(material, costPrice, numOfStrings);
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

    public double calculateMarkUp(){
        return getCostPrice() * 2;
    }
}
