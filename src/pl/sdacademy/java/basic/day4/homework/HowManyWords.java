package pl.sdacademy.java.basic.day4.homework;

import java.util.Scanner;

/*
7.	Pobierz od użytkownika liczbę, która określać będzie ile wyrazów użytkownik chce wprowadzić.
Następnie wczytaj od niego listę ciągów znaków na podstawie, których wygenerujesz wynik.
Wynikiem jest wyraz składający się z ostatnich liter każdego z wprowadzonych słów.
 */
public class HowManyWords {
    public static void main(String[] args) {
        System.out.print("Ile wyrazów chcesz podać? ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] arrayOfStrings = new String[n];
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.print("Podaj wyraz nr " + (i+1) + ": " );
            arrayOfStrings[i] = scan.nextLine();
        }

        String word = "";
        for (int i = 0; i < arrayOfStrings.length; i++) {
            word += (arrayOfStrings[i].charAt(arrayOfStrings[i].length()-1));
        }
        System.out.print("Wynik: " + word);

    }
}
