package pl.sdacademy.java.basic.day4.homework;

/*
1.	Napisz metodę, która będzie implementowała algorytm sita Eratostenesa.
 */

import java.util.Scanner;

public class ErastotenesMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj koniec przedziału: ");
        int a = scan.nextInt();
        Erastotenes.erastotenes(a);
        scan.close();


    }
}
