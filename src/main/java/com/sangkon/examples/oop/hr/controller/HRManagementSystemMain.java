package com.sangkon.examples.oop.hr.controller;

import com.sangkon.examples.oop.hr.service.dto.EmployeeCreateRequest;
import com.sangkon.examples.oop.hr.ui.ConsoleOutputUI;
import com.sangkon.examples.oop.hr.infra.InMemoryEmployRepository;
import com.sangkon.examples.oop.hr.service.EmployeeCommandService;
import com.sangkon.examples.oop.hr.service.EmployeeQueryService;
import com.sangkon.examples.oop.hr.service.dto.EmployeeCreatedResponse;
import com.sangkon.examples.oop.hr.ui.ConsoleInputUI;

public class HRManagementSystemMain {
    private static final InMemoryEmployRepository repository = new InMemoryEmployRepository();
    private static final EmployeeCommandService commandService = new EmployeeCommandService(repository);
    private static final EmployeeQueryService queryService = new EmployeeQueryService(repository);

    public static void main(String[] args) {
        String name = ConsoleInputUI.enterName();
        String no = ConsoleInputUI.enterNo();
        String ssn = ConsoleInputUI.socialSecurityNumber();

        commandService.add(new EmployeeCreateRequest(no, name, ssn));
        EmployeeCreatedResponse response = queryService.findByNo(no);

        ConsoleOutputUI.printResult(response);
    }
}
