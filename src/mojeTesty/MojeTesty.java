package mojeTesty;

import java.util.Scanner;

public class MojeTesty {
       public static void main(String[] args) {

       Scanner testScanner = new Scanner(System.in);


        //test: podajemy same liczby
        System.out.print("Podaj liczbę a: ");
        int a = testScanner.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = testScanner.nextInt();
        System.out.print("Podaj liczbę c: ");
        int c = testScanner.nextInt();
        System.out.print("Podane liczby to a:" + a + " b:" + b + " c:" + c);


        testScanner.nextLine();
        /*
        INFO dodatkowe z internetu:
        Jeżeli korzystając ze Scannera na zmianę będziesz wczytywać liczby oraz napisy,
        to po każdym wczytaniu liczby wywołaj także pustą metodę nextLine(). Dzięki temu
        pozbędziesz się ze strumienia wejścia zbędnego znaku entera, który nie jest konsumowany
        przez metody nextInt(), czy nextDouble()  - mk: czyli nextInt i nextDouble nie przyjmują znaku nowej linii (inaczej niż String), tylko same liczby!
         */

        System.out.print("\n");
        //test: po int podajemy same stringi
        System.out.print("Podaj tekst d: ");
        String d = testScanner.nextLine();
        System.out.print("Podaj tekst e: ");
        String e = testScanner.nextLine();
        System.out.print("Podaj tekst f: ");
        String f = testScanner.nextLine();
        System.out.print("Podane teksty to d:" + d + " e:" + e + " f:" + f);

        System.out.print("\n");
        //test: po string podajemy znów int
        System.out.print("Podaj liczbę g: ");
        int g = testScanner.nextInt();
        System.out.print("Podaj liczbę h: ");
        int h = testScanner.nextInt();
        System.out.print("Podaj liczbę i: ");
        int i = testScanner.nextInt();
        System.out.print("Podane liczby to g:" + g + " h:" + h + " i:" + i);


        /*System.out.println("Podaj liczbę:");
        int number = testScanner.nextInt();
        //testScanner.nextLine();
        System.out.println("Podaj napis:");
        String word = testScanner.nextLine();
        System.out.println(word + " " + number);
        */
        testScanner.close();


    }
}
