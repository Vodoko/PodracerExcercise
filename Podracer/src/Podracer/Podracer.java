package Podracer;

public class Podracer {
    private String name;
    private int speed;
    private int integrity;

    public Podracer(String name, int speed, int integrity) {
        this.name = name;
        this.speed = speed;
        this.integrity = integrity;
    }

    public String getName() {
        return name;
    }

    public int getIntegrity() {
        return integrity;
    }

    public int getSpeed() {
        return speed;
    }
// borde heta take damage istället! och där kanske ta in random in?
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // TODO: Borde vara metoden take damage, och ta in random in?
    // typ public void takeDamage (int damage){
    //integrity -= damage; }
    public void takeDamage(int amount) {
        integrity -= amount;
    }

    public void setIntegritet(int integritet) {
        this.integrity = integritet;
    }

    //Vad ska jag använda denna till? Jag använder den redan!
    public boolean integrityAboveZero (int integrity){
        return integrity > 0;
    }

    public void status (){
        System.out.println(getName() + " har " + getIntegrity() + "/100 HP och kör " + getSpeed() + " km/h!");
    }
}
