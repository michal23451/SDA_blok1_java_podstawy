package pl.sdacademy.java.basic.day4;

import java.util.Scanner;

/*
2. Napisz metody liczące pole kwadratu, prostokąta i trójkąta.
Za pomocą klasy Scanner zdecyduj której figury pole chcesz obliczyć.
Napisz odpowiednie instrukcje warunkowe.
Program przetestuj dla wszystkich możliwości i różnych danych.
 */
public class FiguresMain {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Figures myFigures = new Figures();

        System.out.println("Pole jakiej figury chcesz policzyć? square - kwadrat, rectangle -prostokąt, triangle - trójkąt: ");
        String figure = myScanner.nextLine();

        double a, b, h;

        switch(figure) {
            case "square":
                System.out.println("Podaj a: ");
                a = myScanner.nextDouble();
                myScanner.nextLine();
                System.out.println("Pole kwadratu: " + myFigures.sqare(a));
                break;
            case "rectangle":
                System.out.println("Podaj a: ");
                a = myScanner.nextDouble();
                System.out.println("Podaj b: ");
                b = myScanner.nextDouble();
                System.out.println("Pole prostokąta: " + myFigures.rectangle(a, b));
                break;
            case "triangle":
                System.out.println("Podaj a: ");
                a = myScanner.nextDouble();
                System.out.println("Podaj h: ");
                h = myScanner.nextDouble();
                System.out.println("Pole trójkąta: " + myFigures.triangle(a, h));
                break;
            default:
                System.out.println("Podano niepoprawną wartość!");
        }
        System.out.println("KONIEC");


        //werska z if
        /*
        if (myScanner.nextInt() == 1){
            System.out.println("Chcesz policzyć pole kwadratu.");
            System.out.print("Podaj długość boku kwadratu: ");
            double a = myScanner.nextDouble();
            System.out.println("Pole kwadratu to: " + myFigures.sqare(a));
        }
        //dodać prostokąt i trójkąt
        else {
            System.out.println("Podałeś niepoprawną wartość!");
        }
        */


        myScanner.close();
    }
}
