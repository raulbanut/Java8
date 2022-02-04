package functionalInterfaces;

public class FunctionExampleTwo {
    public static String performConcat(String string) {
        return FunctionExampleOne.addSomeString.apply(string);
    }

    public static void main(String[] args) {
        String result = performConcat("HELLO");

        System.out.println("Result: " + result);
    }
}
