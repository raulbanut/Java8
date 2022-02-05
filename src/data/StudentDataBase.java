package data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> {
        return new Student("Adam",
                2,
                3.6,
                "male",
                Arrays.asList("swimming", "basketball", "volleyball"));
    };

    public static List<Student> getAllStudents() {
        Student studentOne = new Student("Adam",
                2,
                3.6,
                "male",
                Arrays.asList("swimming", "basketball", "volleyball"));

        Student studentTwo = new Student("Jenny",
                2,
                3.8,
                "female",
                Arrays.asList("swimming", "gymnastics", "soccer"));

        Student studentThree = new Student("Emily",
                3,
                4.0,
                "female",
                Arrays.asList("swimming", "gymnastics", "aerobics"));

        Student studentFour = new Student("Dave",
                3,
                3.9,
                "male",
                Arrays.asList("swimming", "gymnastics", "soccer"));

        Student studentFive = new Student("Sophia",
                4,
                3.5,
                "female",
                Arrays.asList("swimming", "dancing", "football"));

        Student studentSix = new Student("James",
                4,
                3.9,
                "male",
                Arrays.asList("swimming", "basketball", "baseball"));

        List<Student> students = Arrays.asList(studentOne, studentTwo, studentThree, studentFour, studentFive, studentSix);
        return students;
    }
}
