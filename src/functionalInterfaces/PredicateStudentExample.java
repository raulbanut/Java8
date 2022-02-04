package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> predicateOne = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> predicateTwo = student -> student.getGpa() >= 3.9;
    static List<Student> students = StudentDataBase.getAllStudents();

    public static void filterStudentsByGradeLevel() {
        System.out.println("filterStudentsByGradeLevel: ");
        students.forEach((student -> {
            if (predicateOne.test(student)) {
                System.out.println(student);
            }
        }));
        System.out.println();
    }

    public static void filterStudentsByGpa() {
        System.out.println("filterStudentsByGpa: ");
        students.forEach((student -> {
            if (predicateTwo.test(student)) {
                System.out.println(student);
            }
        }));
        System.out.println();
    }

    public static void filterStudentsByGradeLevelAndGpa() {
        System.out.println("filterStudentsByGradeLevelAndGpa: ");
        students.forEach((student -> {
            if (predicateOne.and(predicateTwo).test(student)) {
                System.out.println(student);
            }
        }));
        System.out.println();
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();

        filterStudentsByGpa();

        filterStudentsByGradeLevelAndGpa();
    }
}
