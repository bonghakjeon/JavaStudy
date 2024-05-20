package Knou.Ch02;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for(int i = 0, item = numbers[0]; i < numbers.length; item = numbers[i++]) {
            System.out.println("Count is: " + item);
        }
    }
}
