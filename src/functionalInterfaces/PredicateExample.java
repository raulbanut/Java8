package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicateOne = (number) -> {
        return number % 2 == 0;
    };
    static Predicate<Integer> predicateTwo = (number) -> number % 2 == 0;
    static Predicate<Integer> predicateThree = (number) -> number % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Predicate and result for 10 is: " +
                predicateTwo.and(predicateThree).test(10)); // predicate chaining
        System.out.println("Predicate and result for 9 is: " +
                predicateTwo.and(predicateThree).test(9)); // predicate chaining
        System.out.println("Predicate and result for 15 is: " +
                predicateTwo.and(predicateThree).test(15)); // predicate chaining
    }

    public static void predicateOr() {
        System.out.println("Predicate or result for 10 is: " +
                predicateTwo.or(predicateThree).test(10)); // predicate chaining
        System.out.println("Predicate or result for 9 is: " +
                predicateTwo.or(predicateThree).test(9)); // predicate chaining
        System.out.println("Predicate or result for 15 is: " +
                predicateTwo.or(predicateThree).test(15)); // predicate chaining
    }

    public static void predicateNot() {
        System.out.println("Predicate negate OR result for 15 is: " +
                predicateTwo.or(predicateThree).negate().test(15));
    }

    public static void main(String[] args) {
        System.out.println(predicateOne.test(4));
        System.out.println(predicateTwo.test(4));

        predicateAnd();
        predicateOr();
        predicateNot();
    }
}
