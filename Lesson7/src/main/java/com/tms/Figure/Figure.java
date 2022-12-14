package com.tms.Figure;

public abstract class Figure {
    double p;
    double s;
    String Name;
    public abstract double figureArea();
    public abstract double perimeter();
    public void showinfo() {
        System.out.println("Площадь "+this.Name+" = "+ figureArea()+"\nЕго периметр = " + perimeter());
    }
}
