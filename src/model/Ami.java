package model;

public class Ami {
    private final String nom;
    private int limiteBieres;

    public Ami(String nom, int limiteBieres) {
        this.nom = nom;
        this.limiteBieres = limiteBieres;
    }

    public String getNom() {
        return nom;
    }

    public void boitUneBiere() {
        if (limiteBieres == 0) {
            System.out.println(nom + " est déjà saoul et ne peut plus boire.");
        } else {
            limiteBieres--;
            System.out.println(nom + " a bu une bière et peut encore boire " + limiteBieres + " bières.");
        }
    }
}
