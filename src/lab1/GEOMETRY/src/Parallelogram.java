package lab1.GEOMETRY.src;

public class Parallelogram extends Polygon{
    public float base, height;
    public Parallelogram(String type, float base, float height) {
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
    @Override
    public void draw() {
        System.out.println("Draw a Parallelogram");
    }
}
