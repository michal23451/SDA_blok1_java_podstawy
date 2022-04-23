package pl.sdacademy.java.basic.day4;
/*
 1. Napisz metodę, która będzie przyjmować 2 parametry: miesięczną pensję i ilość miesięcy. Metoda powinna zwracać wynik – ilość pieniędzy zarobionej przez ten czas. Utwórz ją w osobnej klasie, wywołaj w klasie z metodą main.
 */
public class MoneyMain {
    public static void main(String[] args) {
        Money myMoney = new Money();

        System.out.println(myMoney.allMoney(999,2));
    }
}
