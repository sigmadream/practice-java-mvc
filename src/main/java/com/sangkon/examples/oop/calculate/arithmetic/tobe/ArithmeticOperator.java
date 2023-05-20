package com.sangkon.examples.oop.calculate.arithmetic.tobe;

public interface ArithmeticOperator {
    boolean supports(String operator);

    //    int calculate(final int operand1, final int operand2);
    int calculate(final PositiveNumber operand1, final PositiveNumber operand2);
}
