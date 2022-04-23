package pl.sdacademy.java.basic.day2;

public class Dz2ZadaniePetle {
    public static void main(String[] args) {

        //1
        int[] array1 = new int[10];
        for (int i=0; i<array1.length; i++) {
            array1[i]=(i+1)*7;
            System.out.println("Indeks nr " + i + ": " + array1[i]);
        }


        //2
        System.out.println("\n\nPodzielne przez 3:");
        for (int i=0; i<array1.length; i++){
            if(array1[i]%3==0){
                System.out.println(array1[i]);
            }
        }

        //3
        int clock=10;
        System.out.println("\n\nBomba została podłożona!");
        do{
            System.out.println("Bomba wybuchnie za " + clock);
            clock--;
        }
        while(clock>0);
        if(clock==0) {
            System.out.println("Bomba została zdetonowana");
        }

        //4
        int a = 5;
        int[] array2 = {4,7,5,8,123};
        for(int i=0; i < array2.length ; i++){
           if(array2[i]==a){
               System.out.println("\n\nLiczba: " + a + " znajduje się w tablicy. Potwierdzenie: " + array2[i]);
               break; // nie ma sensu dalej szukać
           }
        }

        //5
        int[] array3 = {-455,2487,-154,144,8,-3, -999};
        int counter=0; //liczymy ile jest liczb ujemnych
        for(int i=0; i < array3.length; i++){
            if(array3[i]<0) {
                counter++;
            }
        }

        System.out.println("W tablicy są: " + counter + " liczby ujemne");

        if(counter>0){
            int[] array4 = new int[counter];
            counter=0;
            for(int i=0; i < array3.length; i++){
                if(array3[i]>=0){
                    continue;
                }
                array4[counter]=array3[i];
                System.out.println(array4[counter]);
                counter++;
            }
        }

        //2 sposób
        System.out.println("\n\n\n");
        if(counter>0) {
            int[] array4 = new int[counter];
            for (int i = 0, j = 0; i < array3.length; i++) {
                if (array3[i] >= 0) {
                    continue;
                }
                array4[j] = array3[i];
                System.out.println(array4[j]);
                j++;
            }
        }

        //5 rozwiązanie z zajęć
        System.out.println("\n\n\n");
        int [] arrayOfNumbers = {42, -4, 544, -1, -9};
        int counter2 = 0;
        for(int i =0; i<arrayOfNumbers.length;i++){
            if(arrayOfNumbers[i] < 0){
                counter2++;
            }
        }
        int [] arrayOfNegativesNumbers = new int[counter2];
        int x = 0;
        for(int i = 0; i <arrayOfNumbers.length;i++){
            if(arrayOfNumbers[i] < 0 ){
                arrayOfNegativesNumbers[x] = arrayOfNumbers[i];
                x++;
            }
        }

        for (int counter3 : arrayOfNegativesNumbers) {

            System.out.println(counter3);
        }





    }
}
