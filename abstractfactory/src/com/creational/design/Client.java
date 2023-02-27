package com.creational.design;

public class Client {
    ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.MEDIUM, 20480);
        i1.start();
        i1.stop();

        System.out.println("*********************");
        Client gcp = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Instance.Capacity.LARGE, 40960);
        i2.start();
        i2.stop();
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
}
