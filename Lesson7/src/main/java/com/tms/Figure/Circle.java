package com.tms.Figure;

public class Circle extends Figure{

    int r;

    public Circle(){
        this.Name = "Default MIHAIL";
        this.r = 5;
    }
    public Circle(String nameCircle, int radius){
        this.Name = nameCircle;
        this.r = radius;
    }
    @Override
    public double figureArea() {
        double x = Math.pow(this.r,2);
        this.s = Math.PI*x;
        return this.s;
    }

    @Override
    public double perimeter() {
       this.p = 2*Math.PI*this.r;
        return this.p;
    }
}
