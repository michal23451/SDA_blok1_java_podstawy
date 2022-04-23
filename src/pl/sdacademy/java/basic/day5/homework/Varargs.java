package pl.sdacademy.java.basic.day5.homework;
/*

1. Napisz metodę przyjmującą dowolną liczbę parametrów typu int, następnie zwracającą ich sumę. Użyj mechanizmu varargs
 2. Napisz metodę przyjmującą dowolną ilość parametrów String. Wydrukuj drukowanymi literami wszystkie wprowadzone słowa.
3. Napisz metodę, przyjmującą dowolną ilość liczb całkowitoliczbowych. Metoda powinna zwracać liczbę, która będzie  określać ile liczb w zadanym zbiorze jest parzysta. Wykorzystaj mechanizm varargs.

 */
public class Varargs {
    public static void main(String[] args) {
        System.out.println(sumVarargs(4,7,1,9,99));
        upperWord("Daria", "Wiktorek", "Michał");
        System.out.println(evenNumbers(-1,2,4,3,-2,5,9,-6,7,7,-8,2,3));
    }

    //1
    static int sumVarargs(int... a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    //2
    static void upperWord(String... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toUpperCase());
        }
    }

    //3
    static int evenNumbers(int... a) {//liczby parzyste
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
