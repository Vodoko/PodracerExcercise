package Podracer;

public class Podracer {
    private String name;
    private int hastighet;
    private int integritet;

    public Podracer(String name, int hastighet, int integritet) {
        this.name = name;
        this.hastighet = hastighet;
        this.integritet = integritet;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSpeed(int hastighet) {
        this.hastighet = hastighet;
    }

    public boolean integrityAboveZero (int integritet){
        return integritet > 0;
    }
}
