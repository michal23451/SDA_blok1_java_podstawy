package pl.sdacademy.java.basic.day2;

import java.util.Locale;
import java.util.Scanner;

public class Dz2Scanner {
    public static void main(String[] args) {
        //Scanner wejscie = new Scanner(System.in);
        //String napisanaLinia = wejscie.nextLine(); //nextLine służy do podania ciągu znaków (po naciśniećiu enter), jeste też nextInt, nextDouble
        //System.out.println("napisanalinia: " + napisanaLinia);

        //Scanner wejscie2 = new Scanner(System.in);
        //System.out.println("podaj swoją ulubioną liczbę: ");
        //int myInt = wejscie2.nextInt();
        //System.out.println("Twoja ulbiona liczba: " + myInt);

        //Scanner wejscie3 = new Scanner(System.in);
        //System.out.println("Podaj swój ulubiony kolor: ");
        //String myColor = wejscie3.nextLine();
        //System.out.println("Twój ulubiony kolor: " + myColor);

        Scanner wejscie4 = new Scanner(System.in);
        System.out.println("Podaj liczbę zmiennoprzecinkową: ");
        double myDouble = wejscie4.nextDouble(); //UWAGA - w konsoli dla double dajemy przecinek, a nie kropkę jak w inicjalizacji zmiennych (mozna to zmienić gdzieś w ustawieniach intellij ale domyślnie dla Polski ("polski" system operacyjny) jest przecinek)
        //wejscie4.useLocale(Locale.US); //to pozwala wczytać z kropką zamiast przecinka
        wejscie4.nextLine(); //UWAGA PO LICZBACH PRZED STRINGIEM MUSIMY w ten sposób SKONSUMOWAC ZNAK NOWEJ LINII!!!!
        /*
        INFO dodatkowe z internetu:
        Jeżeli korzystając ze Scannera na zmianę będziesz wczytywać liczby oraz napisy,
        to po każdym wczytaniu liczby wywołaj także pustą metodę nextLine(). Dzięki temu
        pozbędziesz się ze strumienia wejścia zbędnego znaku entera, który nie jest konsumowany
        przez metody nextInt(), czy nextDouble()  - mk: czyli nextInt i nextDouble nie przyjmują znaku nowej linii (inaczej niż String), tylko liczby!
         */

        System.out.println("Liczba zmiennoprzecinkowa: " + myDouble);
        //UWAGA - nie tworzymy nowych scannerów
        System.out.println("Podaj swoje ulubione imie: ");
        String myFavName = wejscie4.nextLine();
        System.out.println("Twoje ulubione imie: " + myFavName);
        System.out.print("Podaj swój wiek: ");
        int age = wejscie4.nextInt();
        System.out.print("Twój wiek to: " + age);


        wejscie4.close(); //dobra praktyka - zamykamy skaner jak skońćzymy pobierać dane



    }
}

