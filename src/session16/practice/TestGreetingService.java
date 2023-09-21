package session16.practice;

public class TestGreetingService {

    public static void main(String[] args) {
        //anonymous class
        GreetingService anonymousGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello " + message);
            }
        };
        anonymousGreetingService.greet("Ionut");

        //lambda
        GreetingService lambdaGreetingService = message -> System.out.println("Hello " + message);
        lambdaGreetingService.greet("Maria");
    }
}