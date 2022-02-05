package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Activities: " + printStudentActivities());
    }
}
