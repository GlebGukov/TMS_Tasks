package com.tms;
import com.tms.Vector.*;

public class Main {

    public static void main(String[] args) {

        Vector a = new Coordinates2D(20,20);
        Vector b = new Coordinates2D(15,15);
        Vector c = new Coordinates3D(15,15,15);
        Vector d = new Coordinates3D(17,14,23);
        a.lenght(12,14);
        b.lenght(12,15);
        c.lenght(13,15,12);
        d.lenght(13,10,10);
        a.status(2);
        b.status(2);
        b.sum(a);
        b.min(a);
        c.sum(d);
        c.min(d);
        a.scalar2D(b);
        c.scalar3D(d);





    }


}
