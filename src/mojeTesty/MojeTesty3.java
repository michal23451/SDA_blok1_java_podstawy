package mojeTesty;

public class MojeTesty3 {

    static void returnExample(int number) {
        if (number % 2 == 0) {
            return;
        }
        System.out.println("Metoda: " + number);
    }

    public static void main(String[] args) {
        returnExample(20);


    }



}
