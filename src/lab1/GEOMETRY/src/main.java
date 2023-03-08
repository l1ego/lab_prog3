package lab1.GEOMETRY.src;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Polygon[] polygons = new Polygon[10];
        Geometries figure = new Geometries(polygons);

        Polygon T = new Polygon("Triangle");
        figure.addPolygon(T, 10, 10);

        Polygon R = new Polygon("Rectangle");
        figure.addPolygon(R, 15,10);

        Polygon P = new Polygon("Parallelogram");
        figure.addPolygon(P, 15,12);

        addUserPolygon(figure);

        figure.printPolygons(polygons);

    }

    private static void addUserPolygon(Geometries figure) {
        Scanner Pol = new Scanner(System.in);
        System.out.println("1 = Triangle, 2 = Rectangle, 3 = Parallelogram");
        int typeP = Pol.nextInt();
        System.out.println("Enter the length of the base");
        float lengthP = Pol.nextFloat();
        System.out.println("Enter the height of the base");
        float heightP = Pol.nextFloat();
        addUserPolygonR(figure,typeP, lengthP, heightP);
    }

    private static void addUserPolygonR(Geometries figure, int typeP, float lengthP, float heightP) {
        switch (typeP){
            case 1 -> {
                Polygon T1 = new Polygon("Triangle");
                figure.addPolygon(T1, lengthP, heightP);
            }
            case 2 -> {
                Polygon R1 = new Polygon("Rectangle");
                figure.addPolygon(R1, lengthP, heightP);
            }
            case 3 -> {
                Polygon P1 = new Polygon("Parallelogram");
                figure.addPolygon(P1, lengthP, heightP);
            }
        }
    }
}
