package pl.sdacademy.java.basic.day4;

public class SilniaMain {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(silnia(a));

        int[] b = {4, 8,-8 , 4, 3888, 1, 99};
        minMax(b);

        System.out.println(chooseTheBiggest(b));
        System.out.println(chooseTheLowest(b));



    }

    //5. Napisz program obliczający silnie liczby naturalnej n. Liczbe n użytkownik wprowadza z klawiatury.
    static int silnia (int a){
        int result = 1;
        if (a == 0) {
            result = 1;
        }
        else if (a > 0) {
            for (int i= 1; i <= a; i++){
                result *= i;
            }
        }
        return result;
    }

    //6.   Napisz metodę, która będzie wypisywała największą i najmniejszą wartość w zadanej tablicy.
    static void minMax(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
            else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Max: " + maxValue + " Min: " + minValue);

    }

    //lub inaczej zad.6 jako dwie funkcje
    static int chooseTheBiggest(int[] array) {
        int theBiggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > theBiggest) {
                theBiggest =array[i];
            }
        }
        return theBiggest;
    }
    static int chooseTheLowest(int[] array) {
        int theLowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < theLowest) {
                theLowest =array[i];
            }
        }
        return theLowest;
    }

}
