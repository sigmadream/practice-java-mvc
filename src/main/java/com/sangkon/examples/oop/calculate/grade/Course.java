package com.sangkon.examples.oop.calculate.grade;

public class Course {
    public static final int MAJOR_CREDIT = 3;
    public static final int GENERAL_CREDIT = 2;
    private final String subject;
    private final int credit;
    private final String grade;

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }

    public double getGradeToNumber() {
        double grade = 0;
        switch (this.grade) {
            case "A+":
                grade = 4.5;
                break;
            case "A":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C":
                grade = 2.0;
                break;
            case "D+":
                grade = 1.5;
                break;
            case "D":
                grade = 1.0;
                break;
            case "F":
                grade = 0.0;
                break;
        }
        return grade;
    }
}
