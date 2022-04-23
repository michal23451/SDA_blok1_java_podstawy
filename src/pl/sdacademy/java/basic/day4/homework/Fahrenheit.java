package pl.sdacademy.java.basic.day4.homework;
/*
3.	Napisz program zamieniający temperaturę podaną w stopniach Fahrenheita na temperaturę wyrażoną w stopniach Celsjusza. Dane wejściowe wprowadzamy z klawiatury w postaci liczby całkowitej.
 */
import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        System.out.print("Podaj temperaturę w stopnicach Fahrenheita: ");
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        double c = (f - 32) / 1.8;
        System.out.print("Temperatura w stopniach Celsjusza: " + String.format("%.2f", c));
        scan.close();
    }
}
