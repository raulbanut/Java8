package Imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 9);

        /**
         * Imperative
         */

        List<Integer> uniqueListOne = new ArrayList<>();

        for (Integer integer : integerList) {
            if (!uniqueListOne.contains(integer)) {
                uniqueListOne.add(integer);
            }
        }

        /**
         * Declarative
         */

        List<Integer> uniqueListTwo = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("uniqueListOne: " + uniqueListOne);
        System.out.println("uniqueListTwo: " + uniqueListTwo);
    }
}
