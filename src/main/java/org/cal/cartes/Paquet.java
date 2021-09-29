package org.cal.cartes;

import java.util.*;

public class Paquet {
    private List<Carte> paquet;
    private Deque<Carte> pileDefausse;

    private static List<Carte> JeuStandard52 = null;
    public static List<Carte> getJeuStandard52(){
        if(JeuStandard52 == null){
            List<Carte> buffer = new ArrayList<>();
            for(Enseigne e : Enseigne.values()) {
                for(Valeur v : Valeur.values()) {
                    buffer.add(new Carte(e, v));
                }
            }

            JeuStandard52 = Collections.unmodifiableList(buffer);
        }

        return JeuStandard52;
    }

    public Paquet() {
        this.paquet = new LinkedList<>(getJeuStandard52());
    }

    public void brasser(){
        for(int i = 0; i < paquet.size(); i++) {
            int newIndex = (int)(Math.random() * paquet.size());
            Carte tmp = paquet.get(i);
            paquet.set(i, paquet.get(newIndex));
            paquet.set(newIndex, tmp);
        }
    }

    public Carte pige(){
        return null;
    }

    public Carte pigeDefausse(){
        return null;
    }

    public void defausser(Carte c){

    }

}
