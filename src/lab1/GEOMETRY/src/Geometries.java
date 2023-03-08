package lab1.GEOMETRY.src;
public class Geometries {
    public static int totPolygons = 0;
    public Polygon[] polygons;
    public Geometries(Polygon[] polygons) {
        this.polygons = polygons;
    }
    public static int getTotPolygons() {
        return totPolygons;
    }
    public float getBase(Polygon Q){
        if (Q instanceof Triangle){
            return ((Triangle) Q).getBase();
        }else if(Q instanceof Rectangle){
            return ((Rectangle) Q).getBase();
        }else if(Q instanceof Parallelogram){
            return ((Parallelogram) Q).getBase();
        }else{
            System.out.println("What kind of polygon?");
            return 0;
        }
    }
    public float getHeight(Polygon Q){
        if (Q instanceof Triangle){
            return ((Triangle) Q).getHeight();
        }else if(Q instanceof Rectangle){
            return ((Rectangle) Q).getHeight();
        }else if(Q instanceof Parallelogram){
            return ((Parallelogram) Q).getHeight();
        }else{
            System.out.println("What kind of polygon?");
            return 0;
        }
    }
    public int getNumVertices(Polygon Q){
        if (Q instanceof Triangle){
            return ((Triangle) Q).getNumVertices();
        }else if(Q instanceof Rectangle){
            return ((Rectangle) Q).getNumVertices();
        }else if(Q instanceof Parallelogram){
            return ((Parallelogram) Q).getNumVertices();
        }else{
            System.out.println("What kind of polygon?");
            return 0;
        }
    }
    public float getArea(Polygon Q){
        if (Q instanceof Triangle){
            return ((Triangle) Q).getArea();
        }else if(Q instanceof Rectangle){
            return ((Rectangle) Q).getArea();
        }else if(Q instanceof Parallelogram){
            return ((Parallelogram) Q).getArea();
        }else{
            System.out.println("What kind of polygon?");
            return 0;
        }
    }
    public float getPerimeter(Polygon Q){
        if (Q instanceof Rectangle){
            return ((Rectangle) Q).getPerimeter();
        }else{
            System.out.println("I don't know how do that");
            return 0;
        }
    }
    public void addPolygon(Polygon Q, float base, float height){
        int i = getTotPolygons();
        boolean b = true;
        switch (Q.getType()) {
            case "Triangle" -> {
                Triangle T = new Triangle(Q.getType(), base, height);
                if(control(T, b)) {
                    polygons[i] = T;
                    totPolygons++;
                }else {
                    System.out.println("This polygon is already in the list");
                }
            }
            case "Rectangle" -> {
                Rectangle R = new Rectangle(Q.getType(), base, height);
                if(control(R, b)) {
                    polygons[i] = R;
                    totPolygons++;
                }else {
                    System.out.println("This polygon is already in the list ");
                }
            }
            case "Parallelogram" -> {
                Parallelogram P = new Parallelogram(Q.getType(), base, height);
                if(control(P, b)) {
                    polygons[i] = P;
                    totPolygons++;
                }else {
                    System.out.println("This polygon is already in the list ");
                }
            }
            default -> System.out.println("Polygon not accepted ");
        }
    }
    public void draw(Polygon Q) {
        if (Q instanceof Triangle){
            ((Triangle) Q).draw();
        }else if(Q instanceof Rectangle){
            ((Rectangle) Q).draw();
        }else if(Q instanceof Parallelogram){
            ((Parallelogram) Q).draw();
        }else{
            System.out.println("What kind of polygon?");
        }
    }
    public void printPolygons(Polygon[] A){
        for (int i = 0; i < A.length && A[i] != null; i++) {
            if (A[i] instanceof Triangle){
                System.out.println(i + " : " + A[i].getType() + " base : " + ((Triangle)A[i]).base
                                     + " heigth " + ((Triangle)A[i]).height);
            }else if (A[i] instanceof Rectangle) {
                System.out.println(i + " : " + A[i].getType() + " base : " + ((Rectangle)A[i]).base
                                     + " heigth : " + ((Rectangle)A[i]).height);
            }else if (A[i] instanceof Parallelogram) {
                System.out.println(i + " : " + A[i].getType() + " base : " + ((Parallelogram)A[i]).base
                                     + " heigth : " + ((Parallelogram)A[i]).height);
            }else {
                System.out.println(i + ":" + A[i].getType());
            }
        }
    }
    public boolean control(Polygon Q, boolean b){
        for (int j = 0; j < polygons.length && b && polygons[j] != null; j++) {
            if (polygons[j].getClass() == Q.getClass() && getBase(polygons[j]) == getBase(Q)
                && getHeight(polygons[j]) == getHeight(Q)){
                return b = false;
            }
        }
        return b;
    }
}
