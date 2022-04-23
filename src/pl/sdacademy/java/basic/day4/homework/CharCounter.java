package pl.sdacademy.java.basic.day4.homework;
/*
6.	Stwórz metodę, która będzie przyjmowała 2 parametry: Dowolne zdanie np. Ala ma kota a kot ma ale oraz  jakąś literę: np. „a”. Metoda ma zliczać ilość występowania litery w zdaniu.
 */
import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        System.out.print("Podaj tekst, w którym będziemy zliczać konkretny znak: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        System.out.print("Podaj znak, który będziemy zliczać: ");
        String template = scan.nextLine(); //wzorzec
        while (template.length() > 1) {
            System.out.print("Podaj tylko jeden znak: ");
            template = scan.nextLine();
        }
        char c = template.toLowerCase().charAt(0); //zamieniamy na małe, żeby liczyć bez względu na wielkość liter
        count(sentence, c);

    }


    private static void count (String sentence, char c) {
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.toLowerCase().charAt(i) == c) {
                counter++;
            }
        }
        System.out.println("Ilość znaku \"" + c + "\" w zdaniu \"" + sentence + "\" to: " + counter);
    }
}
