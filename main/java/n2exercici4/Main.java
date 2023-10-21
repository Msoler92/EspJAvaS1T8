package n2exercici4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Joan", "283", "Laura", "328", "Text21", "30e");

        System.out.println(sortListAlphabetically(list));
        System.out.println(sortListLowcaseEFirst(list));
        System.out.println(changeListLowcaseATo4(list));
        System.out.println(subListNumerical(list));

    }
    static List<String> sortListAlphabetically (List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }
    static List<String> sortListLowcaseEFirst (List<String> list) {
        Comparator<String> comparator = (a, b) -> {
            int ret = 0;
            if (a.contains("e") && !b.contains("e")) {
                ret = -1;
            }
            else if (!a.contains("e") && b.contains("e")) {
                ret = 1;
            }
            return ret;
        };
        return list.stream().sorted(comparator).collect(Collectors.toList());
    }

    static List<String> changeListLowcaseATo4 (List<String> list) {
        return list.stream().map(s -> s.replace('a', '4')).collect(Collectors.toList());
    }

    static List<String> subListNumerical (List<String> list) {
        return list.stream().filter(s -> s.matches("-?\\d+(\\.\\d+)?")).collect(Collectors.toList());
    }
}
