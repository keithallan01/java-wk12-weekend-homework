package instruments;

import interfaces.IPlay;

public class Accordion implements IPlay {

    private String type;
    private int numButtons;

    public Accordion(String type, int numButtons){
        this.type = type;
        this.numButtons = numButtons;
    }

    public String getType() {
        return type;
    }

    public int getNumButtons() {
        return numButtons;
    }

    public String play(){
        return "wheeze";
    }
}
