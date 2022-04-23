package mojeTesty;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*int[] a = {1,2,3};
        int[] b = {1,2,3};
        int[] c = new int[3];
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int[] d = c;
        int[] e = c;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        d[0] = 111;
        e[0] = 999;
        System.out.println(c[0]);

        System.out.println("aaa\n\n");
        int f = 5;
        System.out.println(++f);

        System.out.println(f);
        Integer z=5;
        Double x=3.0;
        System.out.println(z);

        Scanner scan = new Scanner(System.in);
        System.out.println(scan.hasNext());*/

        String a = "Michał";
        String b = "Michał";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.indexOf("ha"));
        System.out.println(a.replaceAll("ic","XX"));
        System.out.println("\n\n\n");
        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0); // wynikiem będzie liczba zmiennoprzecinkowa składająca się z 5-ciu znaków i 2 cyfr po przecinku
        System.out.println();
        System.out.printf("100 / 3 = %4d", 100 / 3); // wynikiem będzie liczba całkowita zajmująca 4 znaki - wynik dzielenia będzie zaokrąglony

    }



}
