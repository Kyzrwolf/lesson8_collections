package main;

import java.util.Comparator;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int mathGrade;
    private int biologyGrade;
    private int sociologyGrade;

    public Student(String firstName, String lastName, int age, int mathGrade, int biologyGrade, int sociologyGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mathGrade = mathGrade;
        this.biologyGrade = biologyGrade;
        this.sociologyGrade = sociologyGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public int getAverageGrade() {
        return (mathGrade + biologyGrade + sociologyGrade) / 3;
    }

    static class CompareStudentName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    static class CompareStudentAge implements Comparator <Student> {
        @Override
        public int compare (Student o1, Student o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
