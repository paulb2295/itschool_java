package session17.homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequentWordInSentences {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        System.out.println("Most frequent word is: " + mostFrequentWord(sentences));
    }

    private static String mostFrequentWord(List<String> input) {
        List<String> words = input.stream()
                .flatMap(sentence -> Stream.of(sentence.split("\\s+")))
                .toList();

        Map<String, Long> wordFrequencyMap = words.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        System.out.println(wordFrequencyMap);

        String word = wordFrequencyMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("");
        return word.toUpperCase();
    }


}
