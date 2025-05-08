package app;

import models.Ami;

public class Main {
    public static void main(String[] args) {
        Ami a1 = new Ami("Harry", 1);
        Ami a2 = new Ami("Ron", 2);
        Ami a3 = new Ami("Hermione", 3);

        a1.boitUneBiere();
        a1.boitUneBiere();

        a2.boitUneBiere();
        a2.boitUneBiere();
        a2.boitUneBiere();

        a3.boitUneBiere();
        a3.boitUneBiere();
        a3.boitUneBiere();
        a3.boitUneBiere();
    }
}
