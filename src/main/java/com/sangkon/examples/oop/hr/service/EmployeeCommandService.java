package com.sangkon.examples.oop.hr.service;


import com.sangkon.examples.oop.hr.service.dto.EmployeeCreateRequest;
import com.sangkon.examples.oop.hr.domain.EmployRepository;

public class EmployeeCommandService {
    private final EmployRepository employRepository;

    public EmployeeCommandService(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    public void add(EmployeeCreateRequest createRequest) {
        employRepository.createEmployee(createRequest.toDomain());
    }
}
