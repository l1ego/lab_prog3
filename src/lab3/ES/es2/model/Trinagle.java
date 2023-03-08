package lab3.ES.es2.model;

public class Trinagle extends Polygon{
    private double base, height;

    public Trinagle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Trinagle(int numVertices) {
        super(3);
    }

    @Override
    public double getArea() {
        return base * height / 2;
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
            Trinagle a = (Trinagle) o;
            return this.base == ((Trinagle) a).base && this.height == ((Trinagle) a).height;
        }
        return false;
    }
}
