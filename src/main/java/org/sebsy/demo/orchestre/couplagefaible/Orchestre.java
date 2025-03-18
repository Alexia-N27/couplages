package org.sebsy.demo.orchestre.couplagefaible;

import org.sebsy.demo.orchestre.couplagefort.Pianiste;
import org.sebsy.demo.orchestre.couplagefort.Violoniste;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {
    private List<Object> listeMusiciens;

    public Orchestre() {
        listeMusiciens = new ArrayList<>();
    }

    public void ajout(Object musicien) {
        listeMusiciens.add(musicien);
    }

    public void jouer() {
        for (Object object : listeMusiciens) {
            if (object instanceof Instrument) {
                ((Musicien) object).jouerMorceau();
            }
        }
    }
}
