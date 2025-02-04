package app;

import models.Ami;

public class Main {
    public static void main(String[] args) {
        Ami ami1 = new Ami("Alice", 5);
        Ami ami2 = new Ami("Bob", 3);
        Ami ami3 = new Ami("Charlie", 7);

        ami1.boitUneBiere();
        ami2.boitUneBiere();
        ami3.boitUneBiere();
    }
}
