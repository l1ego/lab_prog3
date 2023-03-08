package lab3.ES.es2.model;

import java.util.*;
public class Geometries<T extends Polygon> {
    List<T> elements;

    public Geometries() {
        this.elements = new ArrayList<T>();
    }


    /*
    * @return the number of the elements in the list
    * */
    public int getElementsNum(){
        return elements.size();
    }

    /*
    * Add a new T element in the list, if the same element it's already in the list
    * the new element will not be added.
    *@param el The new element to be added
    *@return true if the element has been added, false otherwise
    * */
    public boolean add(T el){
        if(elements.contains(el)){
            return false;
        } else {
            elements.add(el);
            return true;
        }
    }

    /*
    * Print the area value for each element in the list
    * */
    public void printArea(){
        for(T el : elements){
            System.out.println("Area :" + el.getArea());
        }
    }

}
