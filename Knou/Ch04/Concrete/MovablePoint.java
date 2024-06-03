package Knou.Ch04.Concrete;

import Knou.Ch04.Abst.Movable;
import Knou.Ch04.Abst.Scalable;

public class MovablePoint implements Movable, Scalable {

    double x, y;

    @Override
    public void add(double dx, double dy) { x += dx; y += dy; }

    @Override
    public void sub(double dx, double dy) { x -= dx; y -= dy; }

    @Override
    public void mul(double s) { x *= s; y *= s; }

    @Override
    public void div(double s) { x /= s; y /= s; }
    
}
