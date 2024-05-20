package Knou.Ch02;

public class ForEachDemo3 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Lee", "Park", "Na" };
        // for(int i = 0; i < names.length; i++) {
        //     System.out.print(names[i] + " ");
        // }

        for(String item : names) {
            System.out.print(item + " ");
        }
    }
}
