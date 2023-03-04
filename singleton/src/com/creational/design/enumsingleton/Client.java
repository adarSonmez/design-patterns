package com.creational.design.enumsingleton;

public class Client {
    public static void main(String[] args) {
        RegistryEnum registry1 = RegistryEnum.INSTANCE;
        RegistryEnum registry2 = RegistryEnum.INSTANCE;

        System.out.println(registry1 == registry2);
    }
}
