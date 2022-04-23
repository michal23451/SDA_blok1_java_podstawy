package pl.sdacademy.java.basic.day1;

public class Dz1HelloWorld {

    //zmienne globalne
    static int xyz;

    public static void main(String[] args){
        /*
        publc - modyfikator dostępu,
        static - oznacza że coś jest statyczne lub nie,
        void - oznacza, że metoda nic nie zwraca
        metoda main przyjmuje parametr w postaci tablicy string-ów
        */
        System.out.println("Hello World");
        System.out.print("Hello Group\n\n\n");

        //zmienne: typ nazwa
        String helloWorld = "Hello World!";
        System.out.println(helloWorld);
        System.out.println(helloWorld);
        System.out.println(helloWorld);

        String goodbyeWorld;
        goodbyeWorld = "Goodbye World!";
        System.out.println(goodbyeWorld);

        byte number = 42;
        int secondNumber = 5445622;
        Integer b=321213;

        //zmienne globalne - zadeklarowana wyżej
        xyz=5;

        //zmienne finalne - nie można zmieniać ich wartości
        final int a = 444555;
        System.out.println(a);
        //a = 6;
        System.out.println(a);

        System.out.println(4+4);
        System.out.println("AAA" + "BBB");

        byte B = 127;
        long longNumber = 1646435433345664L;
        System.out.println(longNumber);

        boolean myFalseValue = false;
        boolean myTrueValue = true;
        boolean myBooleanValue = myFalseValue && myTrueValue; // myBooleanValue będzie miała wartość 'false'
        System.out.println(myBooleanValue);


        char charExample = 'A';
        charExample = 2;
        System.out.println(charExample);
        number = 'A';
        System.out.println(number);

        System.out.println(0.1 + 0.2);


        //operatory
        int c = 50;
        c += 50;
        c *= 50;
        System.out.println(c);
        System.out.println(10/3);
        System.out.println(10/3.0);
        System.out.println(10%3); //% - modulo - reszta z dzielenia
        c=10;
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(--c);

        //operatory relacji
        b=5;
        c=6;
        System.out.println(a==b);
        // != > >= < <=

        //operatory logiczne && || !

        //konwersje typów
        //konwersja niejawna - jeśli typ mniej szczegółowy (np int) konwertujemy do bardziej sczegółowego (np. double) to konwersja robi się sama, nie musimy sami rzutować
        double myDouble = 4334;
        myDouble = (int) 4334; //tak nie trzeba robić bo działa powyższe
        System.out.println(myDouble);

        //konwersja jawna - inaczej rzutowanie, jeśli typ bardziej szczególowy chcemy konwertować do mniej szczegółowego (np. double do int)
        //int myInt = 543.32; //błąd
        int myInt = (int)543.32; // obetnie część dziesiętną
        System.out.println(myInt);

        myInt = 133;
        byte myByte = (byte) myInt;
        System.out.println(myByte);
    }
}
