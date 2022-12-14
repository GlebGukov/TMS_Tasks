package com.tms.Figure;

public class Rectangle extends Figure{
//    String Name;
    int a;
    int b;
    int c = a;
    int d = b;
    public Rectangle(){
        this.Name = "Default Rectangle";
        this.a = 5;
        this.b = 10;
    }
    public Rectangle(String nameRestangle,int firstSide,int secondSide) {
        this.Name = nameRestangle;
        this.a = firstSide;
        this.b = secondSide;
    }
    @Override
    public double figureArea() {
        this.s = this.a * this.b;
        return this.s;
    }
    @Override
    public double perimeter() {
        this.p = 2*(this.a+this.b);
        return this.p;
    }
}
