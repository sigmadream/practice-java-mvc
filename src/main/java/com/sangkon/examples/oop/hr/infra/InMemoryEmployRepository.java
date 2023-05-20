package com.sangkon.examples.oop.hr.infra;


import com.sangkon.examples.oop.hr.domain.EmployRepository;
import com.sangkon.examples.oop.hr.domain.Employee;

import java.util.HashMap;
import java.util.Map;

public class InMemoryEmployRepository implements EmployRepository {
    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public void createEmployee(Employee employee) {
        employees.put(employee.getNo(), employee);
    }

    @Override
    public Employee findByNo(String no) {
        return employees.get(no);
    }
}
