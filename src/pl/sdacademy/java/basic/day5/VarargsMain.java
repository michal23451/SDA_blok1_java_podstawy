package pl.sdacademy.java.basic.day5;

public class VarargsMain {
    public static void main(String[] args) {

        double a;
        a = Varargs.calculateSumOfNumbers(7, 8, 10);
        System.out.println(a);

        Varargs.printNumbers(4,8,5,4);
        Varargs.printArgs("aaa",7,3);
    }
}
