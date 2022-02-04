package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        // java 8 lamda
        // () -> {};
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        Runnable runnableLambdaOne = () -> System.out.println("Inside Runnable 3");

        new Thread(runnable).start();
        new Thread(runnableLambda).start();
        new Thread(runnableLambdaOne).start();

        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}
