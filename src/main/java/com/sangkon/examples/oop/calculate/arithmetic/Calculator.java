package com.sangkon.examples.oop.calculate.arithmetic;

import com.sangkon.examples.oop.calculate.arithmetic.tobe.*;
import com.sangkon.examples.oop.calculate.arithmetic.tobe.ArithmeticOperator;

import java.util.List;

public class Calculator {
//    public static int calculate(int operand1, String operator, int operand2) {
//        if (operator.equals("+")) {
//            return operand1 + operand2;
//        } else if (operator.equals("-")) {
//            return operand1 - operand2;
//        } else if (operator.equals("*")) {
//            return operand1 * operand2;
//        } else if (operator.equals("/")) {
//            return operand1 / operand2;
//        }
//        return 0;
//    }

    //    public static int calculate(int operand1, String operator, int operand2) {
//        return ArithmeticOperator.calculate(operand1, operator, operand2);
//    }
    private static final List<ArithmeticOperator> arithmeticOperator = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

//    public static int calculate(int operand1, String operator, int operand2) {
//        return arithmeticOperator.stream().filter(arithmeticOperator -> arithmeticOperator.supports(operator)).map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2)).findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 사칙 연산이 아닙니다."));
//    }

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperator.stream().filter(arithmeticOperator -> arithmeticOperator.supports(operator)).map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2)).findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 사칙 연산이 아닙니다."));
    }


}
