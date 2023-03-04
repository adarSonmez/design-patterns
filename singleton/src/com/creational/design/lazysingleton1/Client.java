package com.creational.design.lazysingleton1;

public class Client {
    public static void main(String[] args) {
        LazyRegistryWithDCL registry1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL registry2 = LazyRegistryWithDCL.getInstance();

        System.out.println(registry1 == registry2);
    }
}
