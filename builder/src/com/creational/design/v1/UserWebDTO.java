package com.creational.design.v1;

// Immutable Product
public class UserWebDTO implements UserDTO {
    private final String name;
    private final String address;
    private final String age;

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserWebDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}