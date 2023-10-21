package n2exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(processIntList(list));
    }

    static String processIntList(List<Integer> list) {
        return list.stream().map(i -> evenOrOdd(i) + i.toString()).collect(Collectors.joining(","));
    }

    static String evenOrOdd(Integer i) {
        String returnValue = "e";
        if (i%2!= 0) {
            returnValue = "o";
        }
        return returnValue;
    }
}
