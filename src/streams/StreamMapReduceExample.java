package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample {

    private static int numberOfNotebooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("Number of notebooks: " + numberOfNotebooks());
    }
}
