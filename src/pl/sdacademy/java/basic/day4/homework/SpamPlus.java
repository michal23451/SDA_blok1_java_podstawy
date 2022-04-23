package pl.sdacademy.java.basic.day4.homework;
/*
10.	Napisz program „SpamPlus” – program pyta użytkownika o słowo oraz ilość powtórzeń wg której ma wyświetlić zadane słowa. Założenia:
- 2-parametrowa metoda void,
- Do…while (wprowadzone słowo !equals(„”)

 */
import java.util.Scanner;

public class SpamPlus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myWord;
        int n=0;

        do {
            System.out.print("Podaj dowolne słowo: ");
            myWord = scan.nextLine();
            if (!myWord.equals("")) {
                System.out.print("Podaj ilość powtórzeń: ");
                n = scan.nextInt();
                scan.nextLine();
                spam(myWord, n);
            }
            else {
                System.out.print("KONIEC");
            }
            System.out.print("\n\n");
        } while (!myWord.equals(""));

        scan.close();
    }

    private static void spam(String s, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(s);
        }
    }
}
