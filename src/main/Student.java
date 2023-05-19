package main;

import java.util.Comparator;
import java.util.HashMap;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private HashMap<Subject, Integer> grades;

    public Student(String firstName, String lastName, int age, HashMap<Subject, Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = grades;
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

    public String toString() {
        return firstName + " " + lastName + " " + age;
    }

    public boolean getAverageGrade(double averageGrade) {
        double sum = 0;
        for (int value: grades.values()) {
            sum += value;
        }
        return (sum / grades.size()) > averageGrade;
    }

    static class CompareStudentName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    static class CompareStudentAge implements Comparator<Student> {
        @Override
        public int compare (Student o1, Student o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
