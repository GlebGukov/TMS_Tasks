package com.tms.Vector;

public class Vector {
    private int x;
    private int y;
    private int z;
    int ox;
    int oy;
    int oz;
    double lenght;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Vector() {
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector(int x, int y, int z) {
        this(x, y);
        this.z = z;
    }

    public String lenght(int x, int y) {
        setX(x);
        setY(y);
        boolean a = x <= this.ox && y <= this.oy;
        if (a) {
            this.lenght = (Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2))));
            return "длинна вектора "+lenght;
        } else {
           return  "Заданные значения вектора выходят из установленной системы координат";
        }
    }

    public String lenght(int x, int y, int z) {
        setX(x);
        setZ(z);
        setY(y);
        boolean a = x <= this.ox && y <= this.oy && z <= this.oz;
        if (a) {
            this.lenght = (Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)) + (Math.pow(z, 2))));
            return "длинна вектора "+ lenght;
        } else {
            return "Заданные значения вектора выходят из установленной системы координат";
        }
    }

    public void status(int HowManyVariablesAreInTheVector) {
        if (HowManyVariablesAreInTheVector == 2) {
            System.out.println("Ваш вектор на двумерной системе. x =" + this.x + " y =" + this.y +" длинна вектора ="+ this.lenght);
        } else if (HowManyVariablesAreInTheVector == 3) {
            System.out.println("Ваш вектор на трехмерной системе. x =" + this.x + " y =" + this.y + " z="+this.z+ " длинна вектора ="+ this.lenght);
        } else System.out.println("Не верное количество переменных");
    }
    public void sum (Vector Vector) {
        double s = this.lenght + Vector.lenght;
        System.out.println("Сумма векторов =" + s);
    }
    public void min (Vector Vector) {
        double s = this.lenght - Vector.lenght;
        System.out.println("Разность векторов =" + s);
    }
    public void scalar2D (Vector Vector){
        double s = getX() * Vector.getX() + getY() * Vector.getY();
        System.out.println("Скалярное произведение 2D векторов равна ="+s);
    }
    public void scalar3D (Vector Vector){
        double s = getX() * Vector.getX() + getY() * Vector.getY() + getZ() * Vector.getZ();
        System.out.println("Скалярное произведение 3D векторов равна ="+s);
    }
}

