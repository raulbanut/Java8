package numericStreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream.range(1, 10)
                .asDoubleStream()
                .forEach(value -> System.out.print(value + ", "));
        System.out.println();
        IntStream.rangeClosed(1, 10)
                .forEach(value -> System.out.print(value + ", "));
    }
}
