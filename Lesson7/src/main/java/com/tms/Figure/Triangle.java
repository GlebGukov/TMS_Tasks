package com.tms.Figure;

public class Triangle extends Figure{
//    String Name;
    int a;
    int b;
    int c;
    public Triangle(){
        this.Name = "Default Triangle";
        this.a = 13;
        this.b = 14;
        this.c = 15;

    }
    public Triangle (String NameTriangle, int firstSide,int secondSide,int thirdSide){
        if (NameTriangle.isEmpty()){
            System.out.println("Введите название треугольника");
        }else{
        this.Name =NameTriangle;}
        this.a = firstSide;
        this.b = secondSide;
        this.c = thirdSide;
    }
    @Override
    public double figureArea() {
        double p = (double) (this.a+this.b+this.c)/2;
        double t = p*(p-this.a)*(p-this.b)*(p-this.c);
        this.s = Math.sqrt(t);
        return this.s;
    }

    @Override
    public double perimeter() {
        this.p = this.a+this.b+this.c;
        return this.p;
    }

}
