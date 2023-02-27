package com.creational.design;

public class Ec2Instance implements Instance{

    public Ec2Instance(Capacity capacity) {
        System.out.println("Created " + capacity + " EC2 instance");
    }

    @Override
    public void start() {
        System.out.println("Starting EC2 instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attaching " + storage + " to EC2 instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopping EC2 instance");
    }

    @Override
    public String toString() {
        return "EC2 instance";
    }
}
