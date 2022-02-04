package functionalInterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExampleOne {
    static Function<String, String> function = (name) -> name.toUpperCase(Locale.ROOT);
    static Function<String, String> addSomeString = (name) -> name.toLowerCase(Locale.ROOT).concat(" default");

    public static void main(String[] args) {
        String mesaj = "HeLLo";

        System.out.println("Result function is: " + function.apply(mesaj));
        System.out.println("Result addSomeString is: " + addSomeString.apply(mesaj));
        System.out.println("Result function + addSomeString is: " + function.andThen(addSomeString).apply(mesaj));
        System.out.println("Result function + addSomeString is: " + function.compose(addSomeString).apply(mesaj));

    }
}
