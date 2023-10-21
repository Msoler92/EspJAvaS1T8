package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("ana", "pere", "jordi", "joan", "sira", "noemi", "marco", "ona", "maria", "dolors", "josep"));
        subListContains(stringList, "o").forEach(System.out::println);
    }
    static List<String> subListContains(List<String> list, String ex) {
        return list.stream().filter(s -> s.contains(ex)).collect(Collectors.toList());
    }
}
