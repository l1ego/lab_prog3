package lab1.GEOMETRY.src;

public class Polygon {
    private String type;
    public Polygon(String type){
        this.type = type;

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println("Draw a polygon");
    }
}
