package Knou.Ch04.Concrete;

import Knou.Ch04.Abst.Figure;

public class Circle implements Figure {

    private double radius;

    public Circle(double r) { radius = r; }

    @Override
    public double getArea() {
        return radius * radius * 3.141592; 
    }
    
}
