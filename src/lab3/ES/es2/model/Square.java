package lab3.ES.es2.model;

public class Square extends Polygon{
    private double side;

    public Square(double side) {
        super(4);
        this.side = side;
    }

    public Square() {
        super(4);
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String[] describeAttribute() {
        return new String[] {"side"};
    }

    @Override
    public void setAttributes(double[] attribute) {
        this.side = attribute[0];
    }

    @Override
    public boolean equals(Object o) {
        if( o != null && this.getClass() == o.getClass()){
            Square a = (Square) o;
            return this.side == ((Square) a).side;
        }
        return false;
    }

}
