package com.sangkon.examples.oop.calculate.grade;

import java.util.List;

public class GradeCalculator {
    //    private final List<Course> courses;
//
//    public GradeCalculator(List<Course> courses) {
//        this.courses = courses;
//    }
//
//    public double calculateGrade() {
//        double multipledCreditAndCourseGrade = 0;
//        for (Course course : courses) {
//            multipledCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
//        }
//
//        int totalCompletedCredit = courses.stream().mapToInt(Course::getCredit).sum();
//
//        return multipledCreditAndCourseGrade / totalCompletedCredit;
//    }
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeResult  calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        double averageGrade = totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
        return new GradeResult(averageGrade, totalCompletedCredit);
    }
}
