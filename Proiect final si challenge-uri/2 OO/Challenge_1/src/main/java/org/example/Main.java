package org.example;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter 1", 100, 20);
        Fighter fighter2 = new Fighter("Fighter 2", 120, 15);

        BoxingMatch match = new BoxingMatch(fighter1, fighter2);
        String winner = match.fight();

        System.out.println("Winner: " + winner);
    }
}
