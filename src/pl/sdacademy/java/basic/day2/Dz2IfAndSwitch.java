package pl.sdacademy.java.basic.day2;

public class Dz2IfAndSwitch {
    public static void main(String[] args){

        //if, else, else if

        //switch
        String name = "Borys";
        switch(name){
            case "Wiktor":
                System.out.println("Hej Wiktor");
                break;
            case "Borys":
                System.out.println("Hej Borys");
                break;
            default:
                System.out.println("nie ma takiego imienia");
                break;


        }
    }
}
