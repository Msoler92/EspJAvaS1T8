package n1exercici6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("ana", "87989", "pere", "jordi", "897870700", "joan", "sira", "noemi", "marco", "ona", "121", "173626", "maria", "dolors", "josep"));
        stringList.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
    }
}
