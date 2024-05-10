package DesignPattern.ProtoType;

public class Circle extends Shape {
    private int x, y, r;

    public Circle(int x, int y, int r) {
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        circle.x += 1;
        circle.y += 1;
        return circle;
    }
}
