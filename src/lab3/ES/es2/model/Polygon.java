package lab3.ES.es2.model;

public abstract class Polygon {
    private final int numVertices;

    public Polygon(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public abstract double getArea();
    public abstract String[] describeAttribute();
    public abstract void setAttributes(double[] attribute);

    @Override
    public String toString(){
        return " - " + numVertices + " - ";
    }

    @Override
    public boolean equals(Object o){
        if( o != null && this.getClass() == o.getClass()){
            Polygon a = (Polygon) o;
            return this.numVertices == ((Polygon) a).numVertices;
        }
        return false;
    }
}
