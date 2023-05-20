package com.sangkon.examples.oop.calculate.grade;

import com.sangkon.examples.oop.calculate.grade.ConsoleOutputUI;
import com.sangkon.examples.oop.calculate.grade.Course;
import com.sangkon.examples.oop.calculate.grade.GradeCalculator;
import com.sangkon.examples.oop.calculate.grade.GradeResult;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class GradeCalculatorTest {
    @Test
    void calculateGradeTest() {
        // given
        List<Course> courses = List.of(new Course("OOP", Course.MAJOR_CREDIT, "A+"), new Course("자료구조", Course.MAJOR_CREDIT, "A+"));

        // when
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        GradeResult gradeResult = gradeCalculator.calculateGrade();

        // then
        ConsoleOutputUI.printGrade(gradeResult);
        assertThat(gradeResult.getAverageGrade()).isEqualTo(4.5);
    }
}
