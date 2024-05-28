package Knou.Ch03;

public class Point {
    public int a = 0;
    public int x = 0;

    // 생성자 
    public Point(int a, int b) {
        this.a = a;   // this를 생략할 수 없다.
        this.x = b;   // this를 명시했으며 이 경우는 생략해도 된다.
    }
}
