package com.creational.design;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(10, 10);
        swordsman.attack();
        System.out.println(swordsman);

        // shallow copy
        Swordsman anotherSwordsman = (Swordsman) swordsman.clone();
        System.out.println(anotherSwordsman);
        System.out.println(swordsman);
    }
}
