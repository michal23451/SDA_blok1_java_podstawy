package mojeTesty;

public class KlasyWewnetrzneMain {
    public static void main(String[] args) {
        KlasyWewnetrzne myOuterClass = new KlasyWewnetrzne();
        KlasyWewnetrzne.MyInnerClass myInnerClass1 = myOuterClass.init();
        myInnerClass1.printNumber();    // 5
        KlasyWewnetrzne.MyInnerClass myInnerClass2 = myOuterClass.new MyInnerClass();
        myInnerClass2.printNumber();    // 5

    }
}
