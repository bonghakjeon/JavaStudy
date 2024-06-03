package Knou.Ch04;

import Knou.Ch04.Concrete.CSuper;

public class AnonymousTest {
    public static void main(String[] args) {
        CSuper sub = new CSuper() {
            public int b = 20;
            public void method1() { System.out.println("sub1"); }
            public void method3() { System.out.println("sub2"); }
        };
        // . . . 
    }
}
