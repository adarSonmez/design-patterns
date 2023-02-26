package com.creational.design.v1;

import com.creational.design.common.Address;

import java.time.LocalDate;

public class UserWebDTOBuilder implements UserDTOBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserWebDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserWebDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserWebDTOBuilder withBirthday(LocalDate birthday) {
        age = Integer.toString(LocalDate.now().getYear() - birthday.getYear());
        return this;
    }

    @Override
    public UserWebDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity() + ", " + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
