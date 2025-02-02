package app;

public class Ami {
    private String nom;
    private int bieresRestantes;

    public Ami(String nom, int bieresRestantes) {
        this.nom = nom;
        this.bieresRestantes = bieresRestantes;
    }

    public String getNom() {
        return nom;
    }

    public int getBieresRestantes() {
        return bieresRestantes;
    }

    public void boitUneBiere() {
        if (bieresRestantes > 0) {
            bieresRestantes--;
            System.out.println(nom + " a bu une bière. Il peut encore en boire " + bieresRestantes + ".");
        } else {
            System.out.println(nom + " est déjà saoul et ne peut plus boire de bière.");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Ami ami1 = new Ami("Alice", 5);
            Ami ami2 = new Ami("Bob", 3);
            Ami ami3 = new Ami("Charlie", 7);
    
            System.out.println(ami1.getNom() + " peut boire encore " + ami1.getBieresRestantes() + " bières.");
            System.out.println(ami2.getNom() + " peut boire encore " + ami2.getBieresRestantes() + " bières.");
            System.out.println(ami3.getNom() + " peut boire encore " + ami3.getBieresRestantes() + " bières.");
    
            ami1.boitUneBiere();
            ami2.boitUneBiere();
            ami3.boitUneBiere();
    
            System.out.println(ami1.getNom() + " peut boire encore " + ami1.getBieresRestantes() + " bières.");
            System.out.println(ami2.getNom() + " peut boire encore " + ami2.getBieresRestantes() + " bières.");
            System.out.println(ami3.getNom() + " peut boire encore " + ami3.getBieresRestantes() + " bières.");
        }
    }
}
        
