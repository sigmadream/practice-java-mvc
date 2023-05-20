package com.sangkon.examples.web.calculator.tobe;


import com.sangkon.examples.web.calculator.domain.PositiveNumber;

public interface ArithmeticOperator {
    boolean supports(String operator);
    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}
