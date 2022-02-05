package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x, y) -> x > y ? x : y);
    }

    public static int findMinValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x < y ? x : y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce( (x, y) -> x < y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
//        List<Integer> integerList = new ArrayList<>();

        System.out.println("Max value: " + findMaxValue(integerList));
        if (findMaxValueOptional(integerList).isPresent())
            System.out.println("Max value with optional: " + findMaxValueOptional(integerList).get());

        System.out.println("Min value: " + findMinValue(integerList));
        if (findMinValueOptional(integerList).isPresent())
            System.out.println("Min value with optional: " + findMinValueOptional(integerList).get());
    }
}
