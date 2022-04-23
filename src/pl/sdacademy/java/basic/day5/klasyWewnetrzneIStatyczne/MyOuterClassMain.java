package pl.sdacademy.java.basic.day5.klasyWewnetrzneIStatyczne;

public class MyOuterClassMain {
    public static void main(String[] args) {
        MyOuterClass o = new MyOuterClass();
        MyOuterClass.MyInnerClass i1 = o.init();
        i1.printNumber();    // 5
        MyOuterClass.MyInnerClass i2 = o.new MyInnerClass();
        i2.printNumber();    // 5

        MyOuterClass.MyInnerClass i3 = new MyOuterClass().new MyInnerClass();
        i3.printNumber();


        //statyczne
        //MyOuterClass myOuterClass = new MyOuterClass();
        MyOuterClass.StaticMyInnerClass i4 = new MyOuterClass.StaticMyInnerClass();
        MyOuterClass.StaticMyInnerClass i5 = o.staticInit();
        i4.staticPrintNumber();
        i5.staticPrintNumber();





    }

}
