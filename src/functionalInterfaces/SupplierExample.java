package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Johny",
                    4,
                    4.9,
                    "male",
                    Arrays.asList("swimming", "baseball"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is: " + studentSupplier.get());
        System.out.println("Students are: " + listSupplier.get());
    }
}
