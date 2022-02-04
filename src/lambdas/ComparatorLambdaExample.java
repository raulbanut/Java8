package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer numberOne, Integer numberTwo) {
                return numberOne.compareTo(numberTwo);
                // 0 -> numberOne == numberTwo
                // 1 -> numberOne > numberTwo
                // 2 -> numberOne < numberTwo
            }
        };
        Comparator<Integer> comparatorLambdaOne = (Integer numberOne, Integer numberTwo) -> numberOne.compareTo(numberTwo);

        Comparator<Integer> comparatorLambdaTwo = (numberOne, numberTwo) -> numberOne.compareTo(numberTwo);

        System.out.println("Result of the comparator is: " + comparator.compare(3, 2));
        System.out.println("Result of the comparator using Lambda One is: " + comparatorLambdaOne.compare(3, 2));
        System.out.println("Result of the comparator using Lambda Two is: " + comparatorLambdaTwo.compare(3, 2));
    }
}
