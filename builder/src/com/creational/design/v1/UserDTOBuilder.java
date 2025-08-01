package com.creational.design.v1;

import com.creational.design.common.Address;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserWebDTOBuilder withFirstName(String fname);
    UserWebDTOBuilder withLastName(String lname);
    UserWebDTOBuilder withBirthday(LocalDate birthday);
    UserWebDTOBuilder withAddress(Address address);
    UserDTO build();
    UserDTO getUserDTO();
}
