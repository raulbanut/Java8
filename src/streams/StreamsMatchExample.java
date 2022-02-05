package streams;

import data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() >= 3.9);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static void main(String[] args) {
        System.out.println("Result of all match: " + allMatch());
        System.out.println("Result of any match: " + anyMatch());
    }
}
