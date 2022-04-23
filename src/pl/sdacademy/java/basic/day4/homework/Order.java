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

public class Order {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private Order[] itemsArray;
    private int counter = 0; //do zliczania, ile pozycji jest w tablicy



    //konstruktory
    public Order (int n) {
        itemsArray = new Order[n];
    }

    public Order (String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    //metody
    public void addItem () {
        if (counter == itemsArray.length) {
            System.out.println("Brak wolnych pozycji w zamówieniu!");
            return;
        }
        else if (counter < itemsArray.length)  {
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj nazwę towaru: ");
            String name = scan.nextLine();
            System.out.print("Podaj cenę towaru: ");
            double price;
            while (!scan.hasNextDouble()) {
                System.out.print("Cena musi być liczbą! Podaj liczbę: ");
                scan.nextLine();
            }
            price = scan.nextDouble();
            scan.nextLine();
            System.out.print("Podaj ilość towaru: ");
            int quantity;
            while (!scan.hasNextInt()) {
                System.out.print("Ilość musi być liczbą całkowitą! Podaj liczbę: ");
                scan.nextLine();
            }
            quantity = scan.nextInt();
            scan.nextLine();
            Order o = new Order(name, price, quantity);
            itemsArray[counter] = o;
            counter++;
        }
    }

    public double getValue () {
        double itemsValue = 0;
        for (int i = 0; i < itemsArray.length; i++) {
            if (itemsArray[i] != null) {
                itemsValue += itemsArray[i].itemPrice * itemsArray[i].itemQuantity;
            }
        }
        return itemsValue;
    }

    public int getItemsCount () {
       return counter;
    }

    public void print() {
        System.out.println("Podsumowanie zamówienia");
        for (int i = 0; i < itemsArray.length; i++) {
            if (itemsArray[i] != null) {
                System.out.println(itemsArray[i].itemName + "\t" + itemsArray[i].itemPrice + "zł\t" + itemsArray[i].itemQuantity + "szt\t\t" + itemsArray[i].itemPrice * itemsArray[i].itemQuantity +"zł");
            }
           // else { //testowo wyświetlamy nulle
           //     System.out.println(itemsArray[i]);
           // }
        }
        System.out.println("Wartość zamówienia: " + getValue() +"zł");
    }
}
