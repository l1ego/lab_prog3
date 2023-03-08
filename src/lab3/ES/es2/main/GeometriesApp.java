package lab3.ES.es2.main;

import lab3.ES.es2.model.*;

public class GeometriesApp {
    public static void main(String[] args) {
        Geometries<Rectangle> g= new Geometries<>();
        g.add(new Rectangle(5, 5));
        g.add(new Rectangle(5, 6));
        g.add(new Rectangle(25, 15));
        System.out.println("Numbers of polygons: " + g.getElementsNum());
        System.out.println();
        Geometries<Trinagle> t= new Geometries<>();
        t.add(new Trinagle(4,6));
        t.add(new Trinagle(4,5));
        t.add(new Trinagle(14,15));
        t.add(new Trinagle(4,6));
        t.printArea();
        g.printArea();
        System.out.println("Numbers of polygons: " + t.getElementsNum());

    }
}
