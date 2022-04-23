package pl.sdacademy.java.basic.day2;

public class Dz2Petle {
    public static void main(String[] args){

        for(int i = 0; i<5 ; i+=2){
            System.out.println(i);
        }
        System.out.println("Hello\n\n");

        int [] arrayOfInts={55,88,294,1,12,5};
        for (int i = 0; i < arrayOfInts.length; i++){
            System.out.println(arrayOfInts[i]);
        }


        //break przerywa pętle
        System.out.print("\n\nBREAK:\n");

        for (int i = 0; i < arrayOfInts.length; i++){
            if(arrayOfInts[i] != 1) {
                System.out.println(arrayOfInts[i]);
            }
            else{
                break;
            }
        }
        //słowo continue - przeskoczenie od kolejnej iteracji pętli, jest w prezentacji



        System.out.print("\n\n\n");

        //pętla for each, wykorzystywan żeby "przelecieć" po wszystkich elementach tablicy
        for (int x : arrayOfInts){ //po prawej od dwukropka podajemy nazwę naszej tablicy, po lewej podajemy typ i nazwę pojedynczego elementu
            System.out.println(x);
        }

        System.out.print("\n\n\n");

        //while
        int a=10;
        while (a>0){
            System.out.println(a);
            a--;
        }

        //do while - różnica od while jest taka, że do while przynajmiej raz zawsze się wykona
        int xz=5;
        a=10;
        do{ //to co jest w "do" zawsze się wykona
            xz=-1;
            a--;
            System.out.println(a);
        }
        while(a > 0);


        //for each
        System.out.println("\n\n\n");
        int[] tablica = {3, 9, 5, -5};

        // for each loop
        for (int i: tablica) {
            System.out.println(i);
        }



    }
}
