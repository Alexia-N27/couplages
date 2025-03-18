package org.sebsy.demo.orchestre.couplagefaible;

public class Battrie implements Instrument{
    public void afficher() {
        System.out.println("Je suis une battrie...");
    }

    public void jouer() {
        System.out.println("BIM BIM BIM");
    }
}
