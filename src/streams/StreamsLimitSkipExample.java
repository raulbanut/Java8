package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                //5
                //6
//                .limit(2)
                // 9
                // 10
                .skip(4)
                .reduce((x, y) -> x + y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 6, 7, 8, 9, 10);
        Optional<Integer> limitResult = limit(integerList);
        if (limitResult.isPresent()) {
            System.out.println("The limit result is: " + limitResult.get());
        } else {
            System.out.println("No input is passed!");
        }
    }
}
