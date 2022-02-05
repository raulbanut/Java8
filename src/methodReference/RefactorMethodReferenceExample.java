package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> predicateOne = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student) {
        return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(predicateOne.test(StudentDataBase.studentSupplier.get()));
    }
}
