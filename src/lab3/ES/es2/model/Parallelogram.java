package lab3.ES.es2.model;

public class Parallelogram extends Polygon{
    private double base, height;

    public Parallelogram(double base, double height) {
        super(4);
        this.base = base;
        this.height = height;
    }

    public Parallelogram(int numVertices) {
        super(4);
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public String[] describeAttribute() {
        return new String[] {"base", "height"};
    }

    @Override
    public void setAttributes(double[] attribute) {
        this.base = attribute[0];
        this.height = attribute[1];
    }

    @Override
    public boolean equals(Object o) {
        if( o != null && this.getClass() == o.getClass()){
            Parallelogram a = (Parallelogram) o;
            return this.base == ((Parallelogram) a).base && this.height == ((Parallelogram) a).height;
        }
        return false;
    }
}
