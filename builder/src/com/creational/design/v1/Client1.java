package com.creational.design.v1;

import com.creational.design.common.Address;
import com.creational.design.common.User;

import java.time.LocalDate;

// Our Client class works as a Director
public class Client1 {
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
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    /**
     * Returns a sample user
     */
    public static User createUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthday(LocalDate.of(1990, 1, 1));
        user.setAddress(new Address("123", "Main Street", "New York", "12345"));
        return user;
    }
}
