package streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                //1
                //3
                //5
                //7
                // a=1,b=1(from stream) => result 1
                // a=1,b=3(from stream) => result 3
                // a=3,b=5(from stream) => result 15
                // a=15,b=7(from stream) => result 105
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);

        System.out.println(performMultiplication(integerList));
    }
}
