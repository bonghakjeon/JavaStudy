package Knou.Ch02;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] anArray;           // 배열의 선언
        anArray = new int[10];   // 10개의 원소를 가지는 배열의 생성

        anArray[0] = 100;        // 첫 번째 원소
        anArray[1] = 200;        // 두 번째 원소
        anArray[2] = 300;        // 세 번째 원소
        anArray[3] = 400;        // 네 번째 원소
        anArray[4] = 500;        // 다섯 번째 원소
        anArray[5] = 600;        // 여섯 번째 원소
        anArray[6] = 700;        // 일곱 번째 원소
        anArray[7] = 800;        // 여덟 번째 원소
        anArray[8] = 900;        // 아홉 번째 원소
        anArray[9] = 1000;       // 열 번째 원소

        for(int i = 0; i < anArray.length; i++) {
            System.out.println(i + " 번째 요소 값 : " + anArray[i]);
        }
    }
}
