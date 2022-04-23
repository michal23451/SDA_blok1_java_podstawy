package pl.sdacademy.java.basic.day5.klasyWewnetrzneIStatyczne;

public class MyOuterClass {
    private int outerNumber = 5;
    private static int staticOuterNumber = 7;

    public class MyInnerClass {
        public void printNumber() {
            System.out.println(outerNumber);
        }
    }
    public MyInnerClass init() {
        return new MyInnerClass();  // = this.new MyInnerClass()
    }


    //static:
    public static class StaticMyInnerClass {
        public void staticPrintNumber() {
            System.out.println(staticOuterNumber);
        }
    }
    public StaticMyInnerClass staticInit() {
        return new StaticMyInnerClass();
    }

}
