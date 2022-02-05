package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> consumerOne = System.out::println;

    static Consumer<Student> consumerTwo = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumerOne);
        System.out.println();
        StudentDataBase.getAllStudents().forEach(consumerTwo);
    }
}
