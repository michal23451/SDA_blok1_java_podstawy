package pl.sdacademy.java.basic.day4.homework;

/*
1.	Napisz metodę, która będzie implementowała algorytm sita Eratostenesa.
 */

public class Erastotenes {

    public static void erastotenes(int n) {
        int[] array = new int[n+1]; //n+1 ponieważ podajemy koniec przedziału (ostatnią liczbę), indeksy w tablicy są od 0, a w dalszej części korzystamy z indeksu = n

        for (int i = 2; i <= n; i++) { //wypełniamy całą tablicę jedynkami (1 będzie oznaczać, że liczba jest pierwsza)
            array[i] = 1;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {//zaczynamy od 2, bo 2 to pierwsza liczba pierwsza
            if (array[i] == 1) {
                for (int j = i + i; j <= n; j = j + i) {
                    array[j] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                System.out.println(i);
            }
        }
    }

}
