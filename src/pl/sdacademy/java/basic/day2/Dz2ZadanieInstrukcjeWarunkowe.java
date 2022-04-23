package pl.sdacademy.java.basic.day2;

public class Dz2ZadanieInstrukcjeWarunkowe {
    public static void main (String[] args){

        //1
        int a = 5;
        int b = 25;
        int pole = a*a;

        if(pole==b){
            System.out.println("BINGO!");
        }

        //2
        int age=20;
        if(age>=18){
            System.out.println("Witamy w monopolowym!");
        }
        else{
            System.out.println("Do widzenia!");
        }

        //3
        int day = 5;
        switch (day){
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Niepoprawny dzień tygodnia");
        }

        //4
        double A=10; //cena
        double B=101; //ilość

        if (A*B>1000){
            System.out.println("Cena z rabatem: " + (A*B*0.9));
        }
        else {
            System.out.println("Cena bez rabatu: " + (A*B));
        }

    }
}
