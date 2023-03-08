package lab1.GEOMETRY.src;

public class Rectangle extends Polygon{
    public float base, height;

    public Rectangle(String type, float base, float height) {
        super(type);
        this.base = base;
        this.height = height;
    }

    public int getNumVertices() {
        return 4;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea(){
        return base*height;
    }

    public float getPerimeter(){
        return (base+height)*2;
    }

    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }
}
