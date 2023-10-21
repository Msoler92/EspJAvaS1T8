package n2exercici3;

public class Main {
    public static void main (String[] args) {
        Operation suma = (a, b) -> a + b;
        Operation resta = (a, b) -> a - b;
        Operation multiplicacio = (a, b) -> a * b;
        Operation divisio = (a, b) -> a / b;

        System.out.println("Suma de 10 i 5: " + suma.operacio(10, 5));
        System.out.println("Resta de 10 i 5: " + resta.operacio(10, 5));
        System.out.println("Multiplicació de 10 i 5 :" + multiplicacio.operacio(10, 5));
        System.out.println("Divisió de 10 i 5: " + divisio.operacio(10, 5));
    }
}
