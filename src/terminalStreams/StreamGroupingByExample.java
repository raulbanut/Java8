package terminalStreams;

import data.Student;
import data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    public static void groupStudentByGender() {
        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender))
        );
    }

    public static void customizedGroupingBy() {
        System.out.println(StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"))
        );
    }

    public static void twoLevelGroupingOne() {
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println("studentMap " + studentMap);
    }

    public static void twoLevelGroupingTwo() {
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        summingInt(Student::getNoteBooks)));

        System.out.println("studentMap " + studentMap);
    }

    public static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> stringSetLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));

        System.out.println(stringSetLinkedHashMap);
    }

    public static void main(String[] args) {
//        groupStudentByGender();
//        System.out.println();
//        customizedGroupingBy();
//        System.out.println();
//        twoLevelGroupingOne();
//        System.out.println();
//        twoLevelGroupingTwo();
        System.out.println();
        threeArgumentGroupBy();
    }
}
