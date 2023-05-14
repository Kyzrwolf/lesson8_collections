package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Василий", "Пирожков", 18, 4, 5, 2));
        students.add(new Student("Аркадий", "Смирнов", 15, 3, 4, 5));
        students.add(new Student("Потап", "Мишкин", 20, 5, 5, 5));
        students.add(new Student("Мария", "Мишкина", 27, 4, 4, 3));
        students.add(new Student("Валерия", "Иванова", 17, 2, 5, 5));

        System.out.println("Студенты со средним баллом выше 3: ");
        studentsAverageGrade(students, 3);

        System.out.println("==================================");
        System.out.println("Студенты старше 18: ");
        getStudentOlderThanGivenAge(students, 18);

        System.out.println("==================================");

    }

    public static void studentsAverageGrade(List<Student> students, int averageGrade) {
        for (Student student : students) {
            if (student.getAverageGrade() > averageGrade) {
                System.out.println(student.getFirstName());
            }
        }
    }

    public static void getStudentOlderThanGivenAge(List<Student> students, int age) {
        for (Student student : students) {
            if (student.getAge() >= age) {
                System.out.println(student.getLastName());

            }
        }

    }

}