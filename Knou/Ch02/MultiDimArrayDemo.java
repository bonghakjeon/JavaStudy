package Knou.Ch02;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones"} };

        // System.out.println(names[0][0] + names[1][0]);   // Mr. Smith
        // System.out.println(names[0][2] + names[1][1]);   // Ms. Jones 

        for(int i = 0; i < names.length; i++) {
            for(int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }
    }
}
