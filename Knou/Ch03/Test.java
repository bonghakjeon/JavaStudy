package Knou.Ch03;

class TV {
    private int nSize = 0;
    public TV(int nNewSize) { nSize = nNewSize; }
    public TV() { nSize = 20; }
}

public class Test {
    public static void main(String[] args) {
        TV tv1 = new TV(10);   // 첫 번째 생성자 호출 
        TV tv2 = new TV();              // 두 번째 생성자 호출 
        

        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
    }
}
