package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumerTwo = (student) -> System.out.println(student);
    static Consumer<Student> consumerThree = student -> System.out.print(student.getName());
    static Consumer<Student> consumerFour = student -> System.out.println(student.getActivities());
    static List<Student> students = StudentDataBase.getAllStudents();

    public static void printName() {
        students.forEach(consumerTwo);
    }

    public static void printNameAndActivities() {
        students.forEach(consumerThree.andThen(consumerFour)); //consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition() {
        students.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                consumerThree.andThen(consumerFour).andThen(consumerTwo).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        Consumer<String> consumerOne = (s) -> System.out.println(s.toUpperCase(Locale.ROOT));

        consumerOne.accept("java8");
        System.out.println();
        printName();
        System.out.println();
        printNameAndActivities();
        System.out.println();
        printNameAndActivitiesUsingCondition();
    }
}
