package pl.sdacademy.java.basic.day4;
/*
3. Napisz program-kalkulator operujący na liczbach zmiennoprzecinkowych typu double , który będzie składał się z dwóch klas w osobnych plikach:
Zdefiniuj klasę Calculator która powinna zawierać metody add(), subtract(), multiply(), divide(), czyli kolejno dodawanie, odejmowanie, mnożenie i dzielenie. Zastanów się jakie argumenty powinny przyjmować oraz wartość jakiego typu powinny zwracać
Zdefiniuj klasę klasę testową z metodą main(). Zadeklaruj i zainicjuj w niej co najmniej 2 zmienne typu double, utwórz obiekt klasy Calculator i za jego pomocą oblicz wynik różnych działań matematycznych.
 */
public class Calculator {
    double add(double a, double b) {
        return a + b;
    }
    double substract(double a, double b) {
        return a - b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        return a / b;
    }
}
