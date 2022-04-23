package pl.sdacademy.java.basic.day5;

public class StaticTestMain {
    public static void main(String[] args) {
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
        StaticTest staticTest3 = new StaticTest();

        staticTest1.b = 5;
        staticTest2.b = 10;
        staticTest3.b = 15;

        staticTest1.a = 100;
        staticTest2.a = 150;
        staticTest3.a = 200; //zmienna statyczna jest ZAWSZE TWORZONA W JEDNYM EGZEMPLARZU! system out println zwróci 200 200 200

        //powyższe wywołania dla zmiennej a nie są prawidłowe, zaleca się odwołanie przez nazwę klasy a nie nazwę obiektu, czyli
        StaticTest.a = 300;


        System.out.println(staticTest1.b);
        System.out.println(staticTest2.b);
        System.out.println(staticTest3.b);


        System.out.println(staticTest1.a);
        System.out.println(staticTest2.a);
        System.out.println(staticTest3.a);
    }
}
