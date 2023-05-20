package com.sangkon.examples.oop.hr.service.dto;


import com.sangkon.examples.oop.hr.domain.Employee;

public class EmployeeCreateRequest {
    private String no;
    private String name;
    private String socialSecurityNumber;

    public EmployeeCreateRequest(String no, String name, String socialSecurityNumber) {
        this.no = no;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Employee toDomain() {
        return new Employee(no, name, socialSecurityNumber);
    }
}
