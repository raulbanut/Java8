package imperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {

        /**
         * Imperative - how style of programming
         */

        int sumOne = 0;
        for (int i = 0; i <= 100; i++) {
            sumOne += i;
        }

        /**
         * Declarative - What style of programming
         */

        int sumTwo = IntStream.rangeClosed(0, 100)
                .parallel() // it splits the values
                .sum();

        System.out.println("Sum using imperative style: " + sumOne);
        System.out.println("Sum using declarative style: " + sumTwo);
    }
}
