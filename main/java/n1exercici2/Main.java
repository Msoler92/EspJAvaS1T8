package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("ana", "pere", "jordi", "joan", "sira", "noemi", "marco", "ona", "maria", "dolors", "josep"));

        subListContainsLongerThan(stringList, "o", 5).forEach(System.out::println);

    }
    static List<String> subListContainsLongerThan(List<String> list, String ex, int length) {
        return list.stream().filter(s -> s.contains(ex) && s.length() > length).collect(Collectors.toList());
    }
}
