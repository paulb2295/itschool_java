package session17.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {

        //List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 34);
        printEvenNumbers();

        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce vel sapien at libero aliquet suscipit.";
        printContainingSubstring(input, "pi");

        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        printLengthMap(strings);

        List<Product> products = Arrays.asList(
                new Product("Laptop", 1999.99),
                new Product("Phone", 500.34));
        printProductsPrice(products);

        printListOfCharacters(strings);

        printIncreasedPrices(products);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 6, 7, 8, 34),
                Arrays.asList(10, 12, 34, 62, 27, 81, 34),
                Arrays.asList(14, 42, 34, 26, 17, 28, 34)
        );
        printFlatMap(listOfLists);
        printCountedProducts(products);
        lazyStreamInitialization(strings);

        Optional<String> email = getEmail();
        if (email.isPresent()) {
            System.out.println("User email: " + email.get());
        } else {
            System.out.println("User does not have an email!");
        }

    }

    private static Optional<String> getEmail() {
        //return Optional.of("somth.gmail.com");
        return Optional.ofNullable(null);
        //return null;
    }

    private static void printEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 34);

        //traditional approach
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Traditional approach: " + evenNumbers);

        //stream approach
        List<Integer> evenNumbersStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("Stream Approach: " + evenNumbersStream);
    }


    private static void printContainingSubstring(String string, String substring) {
        List<String> wordsContainingSubstring = Arrays.stream(string.split(" "))
                .filter(word -> word.contains(substring))
                .toList();
        System.out.println("Words containing substring: " + wordsContainingSubstring);
    }


    private static void printLengthMap(List<String> input) {
        List<Integer> result = input.stream()
                .map(String::length)
                .toList();
        System.out.println("Length of strings: " + result);
    }

    private static void printProductsPrice(List<Product> products) {
        List<Double> prices = products.stream()
                .map(Product::getPrice)
                .toList();
        System.out.println("Products Prices: " + prices);
    }

    private static void printListOfCharacters(List<String> input) {
        input.stream()
                .map(StreamsPractice::stringToChar)
                .forEach(System.out::println);

    }

    private static List<Character> stringToChar(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .toList();
    }

    private static void printIncreasedPrices(List<Product> products) {
        List<String> formattedPrices = products.stream()
                .map(product -> product.getPrice() * 1.1)
                .map(newPrice -> "$" + String.format("%.2f", newPrice))
                .toList();
        System.out.println("Increased prices: " + formattedPrices);
    }

    private static void printFlatMap(List<List<Integer>> input) {
        List<Integer> result = input.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(result);
    }

    private static void printCountedProducts(List<Product> products) {
        long count = products.stream()
                .filter(product -> product.getName().startsWith("L"))
                .filter(product -> product.getPrice() > 200)
                .count();
        System.out.println(count);
    }

    private static void lazyStreamInitialization(List<String> input) {
        Stream<String> stream = input.stream()
                .filter(s -> {
                    System.out.println("Filter: " + s);
                    return s.startsWith("b");
                })
                .map(s -> {
                    System.out.println("Map: " + s);
                    return s.toUpperCase();
                });
        System.out.println("Stream created, no operation performed yet ");
        stream.forEach(s -> System.out.println("Foreach: " + s));
    }
}
