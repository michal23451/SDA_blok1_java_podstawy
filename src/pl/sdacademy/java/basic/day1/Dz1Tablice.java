package pl.sdacademy.java.basic.day1;

public class Dz1Tablice {
    static int b; //zmienne globalne mają wartości domyślne, wyświetlenie w main pokaże 0.
    // Zmienne lokalne nie mają wartości domyślnych, trzeba je zainicjalizować, inaczej przy wyświetlaniu będzie błąd
    static String x;
    public static void main(String[] args) {

        //deklaracja tablicy
        String[] myArray = new String[10];

        //bez podawania rozmiaru, ale trzeba zadeklarować od razu
        String[] array = new String[]{"Hello","World","!"};

        int[] myNumbers = new int[5];
        myNumbers[0]=4; //uzupełnienie tablicy wartością, indeksy numerujemy od 0
        myNumbers[1]=7; //uzupełnienie tablicy wartością, indeksy numerujemy od 0
        System.out.println(myNumbers[3]);

        int[] myNumbers2 = new int[]{1,2,3,4,5};

        int a;
        //System.out.println(a);
        System.out.println(b);

        //trzeci sposób
        int[] array3 = {3,4,5};


        String[] imiona = new String[4];
        imiona[0] = "Jan";
        imiona[3] = "roman";
        System.out.println("Element numer 1: " + imiona[0]); // Element numer 1: Jan
        System.out.println("Element numer 2: " + imiona[1]); // Element numer 2: null
        System.out.println("Element numer 3: " + imiona[2]); // Element numer 3: null
        System.out.println("Element numer 4: " + imiona[3]); // Element numer 4: roman

        System.out.println(x);


    }
}
