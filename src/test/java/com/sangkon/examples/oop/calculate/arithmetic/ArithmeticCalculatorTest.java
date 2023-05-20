package com.sangkon.examples.oop.calculate.arithmetic;

import com.sangkon.examples.oop.calculate.arithmetic.tobe.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArithmeticCalculatorTest {
    @DisplayName("사칙 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
//    void additionTest(int operand1, String operator, int operand2, int result) {
//        int calculateResult = Calculator.calculate(operand1, operator, operand2);
//        assertThat(result).isEqualTo(calculateResult);
//    }
    void additionTest(PositiveNumber operand1, String operator, PositiveNumber operand2, int result) {
        int calculateResult = Calculator.calculate(operand1, operator, operand2);
        assertThat(result).isEqualTo(calculateResult);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(arguments(new PositiveNumber(1), "+", new PositiveNumber(2), 3), arguments(new PositiveNumber(1), "-", new PositiveNumber(2), -1), arguments(new PositiveNumber(1), "*", new PositiveNumber(2), 2), arguments(new PositiveNumber(4), "/", new PositiveNumber(2), 2));
    }

    @DisplayName("나눗셈에서 0을 나눌 경우 IllegalArgumentException 예외를 발생시킨다. MVC 기반으로 구현한다.")
    @Test
    void calculateExceptionTest() {
        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0))).isInstanceOf(IllegalArgumentException.class);
    }
}


