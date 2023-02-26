package com.creational.design;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    // Director
    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthdate())
                .withAddress(user.getAddress())
                .build();
    }

    // Sample User
    public static User createUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthday(LocalDate.of(1990, 1, 1));
        user.setAddress(new Address("123", "Main Street", "New York", "12345"));
        return user;

    }
}
