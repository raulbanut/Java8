package terminalStreams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {


    public static void main(String[] args) {
        List<String> studentList = StudentDataBase.getAllStudents()
                .stream()
//                .map(Student::getName).collect(toList());
                .collect(mapping(Student::getName, toList()));

        Set<String> studentSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));

        System.out.println("namesList: " + studentList);
        System.out.println("namesSet: " + studentSet);
    }
}
