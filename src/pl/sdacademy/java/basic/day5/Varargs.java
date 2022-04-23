package pl.sdacademy.java.basic.day5;

//VARARGS to tak napradę reprezentacja tablicy
public class Varargs {
    public static double calculateSumOfNumbers(int... a) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }


    public static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void printArgs(String a, int firstArg, int... numbers) {
        System.out.println("Argument stały1: " + a);
        System.out.println("Argument stały2: " + firstArg);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Argument ze zmiennej grupy: " + numbers[i]);
        }
    }






}
