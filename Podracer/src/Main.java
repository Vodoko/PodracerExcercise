import Podracer.Podracer;
import Race.Utilities;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Podracer podracer1 = new Podracer("anakin", 0, 100);
        Podracer podracer2 = new Podracer("sebulba", 0, 100);

        Utilities randomInt = new Utilities();

        System.out.println("Racet kör igång!");

        while (podracer1.integrityAboveZero(podracer1.getIntegritet()) && podracer2.integrityAboveZero(podracer2.getIntegritet())) {
            // kodblock som körs så länge condition är sann
            podracer1.setSpeed(podracer1.getHastighet() + randomInt.randomInt());
            podracer2.setSpeed(podracer2.getHastighet() + randomInt.randomInt());
            podracer1.setIntegritet(podracer1.getIntegritet() - randomInt.randomInt());
            podracer2.setIntegritet(podracer2.getIntegritet() - randomInt.randomInt());
            System.out.println("Anakin har: " + podracer1.getIntegritet() + " och sebulba har: " + podracer2.getIntegritet());
        }
    }
}