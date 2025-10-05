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

    public int getIntegritet() {
        return integritet;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getHastighet() {
        return hastighet;
    }
// borde heta take damage istället! och där kanske ta in random in?
    public void setSpeed(int hastighet) {
        this.hastighet = hastighet;
    }

    //Borde vara metoden take damage, och ta in random in?
    public void setIntegritet(int integritet) {
        this.integritet = integritet;
    }

    //Vad ska jag använda denna till? Jag använder den redan!
    public boolean integrityAboveZero (int integritet){
        return integritet > 0;
    }
}
