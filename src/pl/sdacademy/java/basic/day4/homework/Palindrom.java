package pl.sdacademy.java.basic.day4.homework;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.print("Podaj słowo do sprawdzenia, czy jest palindromem: ");
        Scanner scan = new Scanner(System.in);
        String myWord = scan.nextLine();
        boolean isPalindrom = false;

        for (int i = 0, j = myWord.length() - 1; i < j/*i < myWord.length() && j >=0*/; i++, j-- ) {
            if (myWord.toLowerCase().charAt(i) == myWord.toLowerCase().charAt(j)) {
                isPalindrom = true;
            }
            else {
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom == true) {
            System.out.print("Słowo \"" + myWord + "\" jest palindromem.");
        }
        else if (isPalindrom == false) {
            System.out.print("Słowo \"" + myWord + "\" nie jest palindromem.");
        }

        scan.close();

    }

}
