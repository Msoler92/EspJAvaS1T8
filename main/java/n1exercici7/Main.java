package n1exercici7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Object> stringList = new ArrayList<>(Arrays.asList("ana", 87989, "pere", "jordi", 897870700, "joan", "sira", "noemi", "marco", "ona", 121, 173626, "maria", "dolors", "josep"));
        stringList.stream().filter(s -> s instanceof String).sorted((s1, s2) -> ((String) s2).length() - ((String)s1).length()).forEach(System.out::println);
    }
}
