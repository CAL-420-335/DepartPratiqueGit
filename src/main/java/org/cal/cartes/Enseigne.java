package org.cal.cartes;

public enum Enseigne {
    Coeur("Rouge"),
    Carreau("Rouge"),
    Pique("Noir"),
    Trefle("Noir");

    private String couleur;
    Enseigne(String couleur) {this.couleur = couleur;}
    public String getCouleur() {return this.couleur;}
}
