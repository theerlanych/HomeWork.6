package com.company;

public class Main {

    public static void main(String[] args) {
        Boss mamBet = new Boss();
        mamBet.setHealth (250);
        mamBet.setDamage (15);
        System.out.println(mamBet.getHealth() + " " + mamBet.getDamage());
        System.out.println("ПОКА ЧТО НИЧЕГО");
        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(20);
        skeleton.weapon.setAwp("AWP");
        skeleton.weapon.setSniper("SNIPER");
        System.out.println(skeleton.printInfo());
    }
}
