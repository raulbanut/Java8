package terminalStreams;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joiningOne() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joiningTwo() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joiningThree() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining One: " + joiningOne());
        System.out.println("Joining One: " + joiningTwo());
        System.out.println("Joining One: " + joiningThree());
    }
}
