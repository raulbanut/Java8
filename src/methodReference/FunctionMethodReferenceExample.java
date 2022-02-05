package methodReference;

import java.util.Locale;
import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase(Locale.ROOT);

    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        String mesaj = "hello";
        System.out.println(toUpperCaseLambda.apply(mesaj));
        System.out.println(toUpperCaseMethodReference.apply(mesaj));
    }
}
