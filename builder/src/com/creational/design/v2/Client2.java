package com.creational.design.v2;

import com.creational.design.common.User;

import java.time.LocalDate;

public class Client2 {
    public static void main(String[] args) {
        User user = createUser();
        UserDTO.UserDTOBuilder builder = UserDTO.getBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    /**
     * This method serves the role of director in builder pattern.
     */
    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setFirstName("Jane");
        user.setLastName("Doe");
        user.setBirthday(LocalDate.of(1990, 1, 1));
        user.setAddress(new com.creational.design.common.Address("123", "Main Street", "New York", "12345"));
        return user;
    }
}
