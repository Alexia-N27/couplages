package org.sebsy.demo.orchestre.couplagefort;

public class Batteur {

    private Battrie battrie;
    private String morceau;

    public Batteur(String morceau) {
        this.battrie = new Battrie();
        this.morceau = morceau;
    }

    public void jouerMorceau() {
        battrie.afficher();
        System.out.println("Morceau: " + morceau);
        battrie.jouer();
    }
}
