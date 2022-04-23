package pl.sdacademy.java.basic.day4.homework;

/*
2.	Napisz klasę Order (zamówienie):
a) w tablicy będzie ona przechowywała pozycje zamówienia.
b) Napisz konstruktor, który utworzy zamówienie o zadanej liczbie pozycji.
c) Klasa powinna również zawierać metody:
1. addItem – dodaje pozycję zamówienia, ale tylko wtedy, gdy w
zamówieniu jest jeszcze miejsce i jeżeli pozycja zamówienia jest
prawidłowa
2. getValue – oblicza łączną wartość zamówienia
3. getItemsCount – oblicza łączną liczbę zamówionych produktów
4. print – wyświetla dane zamówienia, np.
Chleb 3,50zł 1 szt 3,50zł
Cukier 4,00 zł 3 szt 12,00 zł
Wartość zamówienia: 15,50 zł
 */

import java.util.Scanner;

public class OrderMain {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp () {
        System.out.print("Podaj ile pozycji ma mieć zamówienie: ");
        Scanner scan = new Scanner(System.in);
        Order o = new Order(scan.nextInt());
        scan.nextLine();
        int menu;

        //menu
        do {
            System.out.println("\n*****MENU*****");
            System.out.println("Podaj co chcesz zrobić:\n" +
                    "1 - dodać pozycję\n" +
                    "2 - wyświetl łączną wartość zamówienia\n" +
                    "3 - wyświetl liczbę zamówionych produktów\n" +
                    "4 - wyświetl dane zamówienia\n" +
                    "0 - wyjście");
            menu = scan.nextInt();

            switch (menu){
                case 1:
                    o.addItem();
                    break;
                case 2:
                    System.out.println("Lączna wartość zamówienia: " + o.getValue() + "zł");
                    break;
                case 3:
                    System.out.println("Laczna liczba zamówionych produktów: " + o.getItemsCount() + " pozycje/i");
                    break;
                case 4:
                    o.print();
                    break;
                case 0:
                    System.out.println("*****KONIEC*****");
                    scan.close();
                    break;
                default:
                        System.out.println("Niepoprawny wybór!");
                    break;
            }
        } while (menu != 0);

    }
}
