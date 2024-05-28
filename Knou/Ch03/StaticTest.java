package Knou.Ch03;

class CSuper {
    static int nStatic;
    public int nNormal;
}

class CSub extends CSuper {

}

public class StaticTest {
    public static void main(String[] args) {
        CSuper sup = new CSuper();
        CSub sub1 = new CSub();
        CSub sub2 = new CSub();

        sub1.nStatic = 10;

        sup.nNormal = 0;
        sub1.nNormal = 1;
        sub2.nNormal = 2;

        System.out.println("sup: " + sup.nStatic + "," + sup.nNormal);
        System.out.println("sub1: " + sub1.nStatic + "," + sub1.nNormal);
        System.out.println("sub2: " + sub2.nStatic + "," + sub2.nNormal);
    }
}
