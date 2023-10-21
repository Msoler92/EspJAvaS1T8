package n3exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumne> alumnat = new ArrayList<>();
        alumnat.add(new Alumne ("Alex", 23, "JAVA", 7.6));
        alumnat.add(new Alumne ("Joana", 48, "PHP", 4.5));
        alumnat.add(new Alumne ("Pere", 44, "ANGULAR", 5.1));
        alumnat.add(new Alumne ("Mireia", 21, "REACT", 7.8));
        alumnat.add(new Alumne ("Andreu", 34, "JAVA", 4.2));
        alumnat.add(new Alumne ("Ariadna", 52, "PHP", 5.7));
        alumnat.add(new Alumne ("Josep", 44, "ANGULAR", 3.4));
        alumnat.add(new Alumne ("Gisela", 31, "REACT", 9.9));
        alumnat.add(new Alumne ("Antoni", 27, "JAVA", 6.1));
        alumnat.add(new Alumne ("Clara", 35, "PHP", 8.8));

        System.out.println("Mostra per pantalla el nom i l’edat de cada alumne/a.");
        alumnat.forEach(a -> System.out.println(a.getNom() + ", " + a.getEdat()));

        System.out.println("Filtra la llista per tots els alumnes que el seu nom comença per ‘a’." +
                "Assigna a aquests alumnes a una altra  llista i  mostra per pantalla la nova llista (tot  amb lambdes).");
        alumnat.stream().filter(a -> a.getNom().toLowerCase().charAt(0) == 'a').toList().forEach(System.out::println);

        System.out.println("Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.");
        alumnat.stream().filter(a -> a.getNota() >= 5).forEach(System.out::println);

        System.out.println("Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.");
        alumnat.stream().filter(a -> a.getNota() >= 5 && !a.getCurs().equals("PHP")).forEach(System.out::println);

        System.out.println("Mostra tots els alumnes que fan JAVA i són majors d’edat.");
        alumnat.stream().filter(a -> a.getCurs().equals("JAVA") && a.getEdat() >= 18).forEach(System.out::println);
    }
}
