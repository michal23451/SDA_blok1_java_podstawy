package pl.sdacademy.java.basic.day4;
/*
2. Napisz metody liczące pole kwadratu, prostokąta i trójkąta.
Za pomocą klasy Scanner zdecyduj której figury pole chcesz obliczyć.
Napisz odpowiednie instrukcje warunkowe.
Program przetestuj dla wszystkich możliwości i różnych danych.
 */
public class Figures {

    //pole kwadratu
    double sqare (double a) {
        return a * a;
    }

    //pole prostokąta
    double rectangle (double a, double b) {
        return a * b;
    }

    //pole trójkąta
    double triangle (double a, double h) {
        return 0.5 * a * h;
    }
}
