package pl.sdacademy.java.basic.day1;

public class Dz1ExerciseOperatory {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;

        System.out.println(a<b);
        System.out.println(a*b>b);
        System.out.println(b<a+6 && b>a-2);
        System.out.println((a*b)%2==0);

        //lub
        boolean result = a < b;
        boolean result2 = (a*b) > b;
        boolean result3 = b < a+6 && b > a-2;
        boolean result4 = (a*b) % 2 == 0;

        System.out.println(2+3*3);

        /*
        2.	Dla zadanych dwóch liczb wyświetl ich sumę, różnicę, iloczyn, iloraz. Dobierz odpowiedni typ zmiennych. Wynik zaprezentuj w konsoli – format: Liczba 1: a + Liczba 2: b = ….
        3.	Za  deklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość największej z nich.
        4.	Zadeklaruj zmienną typu int i przypisz do niej wartość. Spróbuj wykonać rzutowanie tej zmiennej na long, byte i char
        5.	Zadeklaruj i zainicjalizuj 2 zmienne typu int liczbami nieparzystymi. Większą z nich podziel przez mniejszą. Wynik przypisz do zmiennej typu double. Co należy zrobić by uzyskać pełny wynik z liczbą po przecinku
        */

        //2
        int suma = a+b;
        int roznica = a-b;
        int iloczyn = a*b;
        double iloraz = a/(double)b; //nie wystarczy wstawienie do zmiennej double, trzeba zrobić rzutowanie lub np. 15/7.0

        System.out.println(
                "Liczba 1:"  + suma + " Liczba 2:" + roznica + " Liczba 3:" + iloczyn + " Liczba 4:" + iloraz
        );

        //lub
        System.out.println("Liczba 1:" + a + " + Liczba 2:" + b + " = " + (a+b));
        System.out.println("Liczba 1:" + a + " - Liczba 2:" + b + " = " + (a-b));
        System.out.println("Liczba 1:" + a + " * Liczba 2:" + b + " = " + (a*b));
        System.out.println("Liczba 1:" + a + " / Liczba 2:" + b + " = " + (a/(double)b));

        //3
        int c=45;
        int d=60;
        int e=99;
        System.out.println(Math.max(Math.max(c,d),e));

        //4
        a=130;
        long longA = /*(long)*/ a; //z int do long nie trzeba jawnie konwertować (rzutujemy z mniejszego typu do większego)
        byte byteA = (byte)a;
        char charA = (char)a;

        System.out.println("4:");
        System.out.println(longA);
        System.out.println(byteA);
        System.out.println(charA);

        //5
        a=7;
        b=9;
        double f = b/(double)a;
        System.out.println(f);
    }

}

