package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Ana", "Pere", "Jordi", "Joan", "Sira", "Noemi", "Marco", "Ona", "Antoni", "Ariadna", "Josep"));
        subList(stringList, 'A', 3).forEach(System.out::println);
    }
    static List<String> subList(List<String> list, char ex, int length) {
        return list.stream().filter(s -> s.charAt(0) == ex && s.length() == length).collect(Collectors.toList());
    }
}
