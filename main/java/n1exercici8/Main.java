package n1exercici8;

public class Main {
    public static void main (String[] args) {
        ReverseString rs = s -> (new StringBuilder(s)).reverse().toString();

        System.out.println(rs.reverse("Hola!"));
    }
}
