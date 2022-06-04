package com.company;

public class Main {

    public static void main(String[] args) {

        Spearman spearman1= new Spearman();
        Archer archer1= new Archer();
        spearman1.attack(archer1);
        spearman1.setAttack(10);
        System.out.println(spearman1.getAttack());
    }
}
