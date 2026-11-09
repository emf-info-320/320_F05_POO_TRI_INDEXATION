package models;

import java.util.UUID;

public class Personne {

    private UUID uuid;
    private String nom;
    private String prenom;
    private Double taille;

    public Personne(String nom, String prenom, double taille) {
        this.uuid = UUID.randomUUID();
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Double getTaille() {
        return taille;
    }

    public UUID getUUID() {
        return uuid;
    }


    @Override
    public String toString() {
        return (nom + " " + prenom + " : " + Double.toString(taille));
    }
}
