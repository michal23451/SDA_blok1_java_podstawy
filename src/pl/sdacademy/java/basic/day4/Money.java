package pl.sdacademy.java.basic.day4;

/*
 1. Napisz metodę, która będzie przyjmować 2 parametry: miesięczną pensję i ilość miesięcy. Metoda powinna zwracać wynik – ilość pieniędzy zarobionej przez ten czas. Utwórz ją w osobnej klasie, wywołaj w klasie z metodą main.
 */

public class Money {

    double allMoney(double salary, int numOfMonths) {
        return salary * numOfMonths;
    }
}
