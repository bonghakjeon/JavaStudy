package Knou.Ch04.Abst;

public interface Wrong {
    // void aMethod(String aValue) {
    //     System.out.println("Hi " + aValue);
    // }

    // void aMethod(String aValue);

    default void aMethod(String aValue) {
        System.out.println("Hi " + aValue);
    }
}
