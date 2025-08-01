package com.structural.design;

import com.structural.design.common.Customer;
import com.structural.design.common.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {
    @Override
    public String getName() {
        return getFullName();
    }

    @Override
    public String getDesignation() {
        return getJobTitle();
    }

    @Override
    public String getAddress() {
        return getOfficeLocation();
    }
}
