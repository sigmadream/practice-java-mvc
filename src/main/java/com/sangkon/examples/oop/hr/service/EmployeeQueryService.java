package com.sangkon.examples.oop.hr.service;

import com.sangkon.examples.oop.hr.domain.EmployRepository;
import com.sangkon.examples.oop.hr.service.dto.EmployeeCreatedResponse;

public class EmployeeQueryService {
    private final EmployRepository employRepository;

    public EmployeeQueryService(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    public EmployeeCreatedResponse findByNo(String no) {
        return EmployeeCreatedResponse.of(employRepository.findByNo(no));
    }
}
