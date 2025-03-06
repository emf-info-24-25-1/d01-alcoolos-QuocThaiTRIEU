package app;

import model.Ami;

public class Main {
    public static void main(String[] args) {
        Ami a1 = new Ami("Alice", 5);
        Ami a2 = new Ami("Bob", 2);
        Ami a3 = new Ami("Charlie", 7);

        a1.boitUneBiere();
        a1.boitUneBiere();
        a1.boitUneBiere();

        a2.boitUneBiere();
        a2.boitUneBiere();
        a2.boitUneBiere();

        a3.boitUneBiere();
        a3.boitUneBiere();
        a3.boitUneBiere();
    }
}
