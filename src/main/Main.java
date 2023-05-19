package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Василий", "Пирожков", 17,setGrades(4,4,5)));
        students.add(new Student("Аркадий", "Смирнов", 117, setGrades(5,3,5)));
        students.add(new Student("Аркадий", "Панин", 25, setGrades(5,4,4)));
        students.add(new Student("Борис", "Бритва", 1, setGrades(3,3,4)));
        students.add(new Student("Сергей", "Иванов", 18, setGrades(4,3,3)));
        students.add(new Student("Сергей", "Блинов", -21, setGrades(5,5,5)));


        System.out.println("Студенты со средним баллом выше 4: ");
        System.out.println(studentsAverageGrade(students, 4));

        System.out.println("==================================");
        System.out.println("Студенты старше 18: ");
        System.out.println(getStudentOlderThanGivenAge(students, 18));

        System.out.println("==================================");
        Collections.sort(students,new StudentSort());
        System.out.println(students);
        }

    public static List<Student> studentsAverageGrade(List<Student> students, int averageGrade) {
        List<Student> averageGradeStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverageGrade(averageGrade)) {
                averageGradeStudents.add(student);
            }
        }
        return averageGradeStudents;
    }

    public static List<Student> getStudentOlderThanGivenAge(List<Student> students, int age) {
        List<Student> studentsOlderThanGivenAge = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > age) {
                studentsOlderThanGivenAge.add(student);
            }
        }
        return studentsOlderThanGivenAge;

    }

    public static HashMap<Subject, Integer> setGrades(int biologyGrade, int mathGrade, int sociologyGrade) {
        HashMap<Subject, Integer> grades = new HashMap<>();
        grades.put(Subject.BIOLOGY,biologyGrade);
        grades.put(Subject.SOCIOLOGY,sociologyGrade);
        grades.put(Subject.MATH,mathGrade);
        return grades;
    }

    public sta

}