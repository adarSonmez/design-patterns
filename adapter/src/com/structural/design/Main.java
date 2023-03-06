package com.structural.design;

import com.structural.design.common.BusinessCardDesigner;
import com.structural.design.common.Employee;

public class Main {
    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("John Smith");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("London");
    }

    public static void main(String[] args) {
        // Using class adapter
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        populateEmployeeData(employeeClassAdapter);

        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        String card = businessCardDesigner.designCard(employeeClassAdapter);
        System.out.println(card);

        // Using object adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        card = businessCardDesigner.designCard(employeeObjectAdapter);
        System.out.println(card);
    }
}
