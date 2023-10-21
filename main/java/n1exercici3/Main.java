package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> any = new ArrayList<>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Septembre", "Octubre", "Novembre", "Desembre"));
        any.forEach(m -> System.out.println(m));
    }
}
