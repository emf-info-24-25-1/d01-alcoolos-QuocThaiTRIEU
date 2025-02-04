package models;

public class Ami {
    private final String nom;
    private int bieresRestantes;

    public Ami(String nom, int bieresRestantes) {
        this.nom = nom;
        this.bieresRestantes = bieresRestantes;
    }

    public void boitUneBiere() {
        if (bieresRestantes == 0) {
            System.out.println(nom + " est déjà saoul et ne peut plus boire de bière.");
        } else {
            bieresRestantes--;
            System.out.println(nom + " a bu une bière. Il peut encore en boire " + bieresRestantes + ".");
        }
    }

    public String getNom() {
        return nom;
    }

    public int getBieresRestantes() {
        return bieresRestantes;
    }

    public void setBieresRestantes(int bieresRestantes) {
        this.bieresRestantes = bieresRestantes;
    }
}
