package Knou.Ch04.Concrete;

import Knou.Ch04.Abst.Figure;

public class Box implements Figure {

    private double height, width;

    public Box(double h, double w) { height = h; width = w; }

    @Override
    public double getArea() {
        return height * width; 
    }
    
}
