package Knou.Ch03;

class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }
}

// abstract class GraphicObject {
//     int x, y; 

//     public GraphicObject() {
//         this.x = 0;
//         this.y = 0;
//     }

//     public GraphicObject(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     abstract void draw();
// }

// public class Rectangle extends GraphicObject {

//     private int width, height;

//     public Rectangle() {
//         this(0, 0, 0, 0);
//     }

//     public Rectangle(int width, int height) {
//         this(0, 0, width, height);
//     }

//     public Rectangle(int x, int y, int width, int height) {
//         super(x, y); // 부모클래스(슈퍼클래스) 생성자 GraphicObject(int x, int y) 호출 
//         this.width = width;
//         this.height = height;
//     }

//     @Override
//     void draw() { }
// }

