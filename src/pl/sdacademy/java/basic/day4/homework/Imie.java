package pl.sdacademy.java.basic.day4.homework;
/*
5.	Napisz program, który wczyta imię użytkownika i stwierdzi, czy jest on kobieta, czy mężczyzną. Przyjmij, że tylko imiona żeńskie kończą sie na literę ‘a’.
 */

import java.util.Scanner;

public class Imie {
    public static void main(String[] args) {
        System.out.print("Podaj imię: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (name.endsWith("a")) {
            System.out.println(name + " jest kobietą");
        }
        else {
            System.out.println(name + " jest mężczyzną");
        }

        /*
        name = "Daria";
        System.out.println(name.charAt(name.length()-1));

         */
        scan.close();
    }
}
