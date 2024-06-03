package Knou.Ch04.Concrete;

import Knou.Ch04.Abst.Figure;

public class Triangle implements Figure {

    private double height, width; 

    public Triangle(double h, double w) { height = h; width = w; }

    @Override
    public double getArea() { return height * width * 0.5; }

    public double getHeight() { return height; }

    public double getWidth() { return width; }
}

// import Knou.Ch04.Abst.GraphicObject;

// public class Triangle extends GraphicObject {

//     public Triangle(int a, int b) {
//         x = a;
//         y = b;
//     }

//     @Override
//     public void draw() {
//         System.out.println("  *  ");
//         System.out.println(" * * ");
//         System.out.println("*****");
//     }
    
// }
