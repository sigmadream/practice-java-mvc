package com.sangkon.examples.oop.hr.ui;


import com.sangkon.examples.oop.hr.service.dto.EmployeeCreatedResponse;

public class ConsoleOutputUI {

    public static void printResult(EmployeeCreatedResponse response) {
        System.out.println("조회 결과: " + response);
    }
}
