package lab3.ES.es3;

import java.util.List;

class Calculator {


    /*
    * This abstract class is defined to impose that the type handled by containers
    * passed to add and max define sum and comparison operations.
    * @param <T> type of the elements managed by CNumber
    * */
    static abstract class CNumber <T extends Comparable<T>> implements Comparable<CNumber <T>> {
        T number;

        CNumber(T number) {
            this.number = number;
        }

        public abstract CNumber<T> add(CNumber<T> number);

        @Override
        public int compareTo(CNumber<T> o) {
            return number.compareTo(o.number);
        }

        @Override
        public String toString() {
            return number.toString();
        }
    }

    /*
         * Print the content of a numeric list
         * */
    public static <T extends Comparable<T>> void printNumbers(List<? extends CNumber<T>> list){
        for (CNumber<T> el : list){
            System.out.println(el);
        }
    }

    /*
         * Makes the sum of a numeric list, if the list is empty the result is 0.
         * @param list The generic list of numerics elements, of which to calculate summation
         * @return summation of the elements in the list, null if is empty
         * */
    public static <T extends Comparable<T>> CNumber<T> sum(List<CNumber<T>> list){
        if(list.size() == 0){
            return null;
        }
        CNumber<T> sum = list.get(0);
        for (CNumber<T> tcNumber : list) {
            sum = sum.add(tcNumber);
        }
        return sum;
    }

    /*
         * return the maximum value in the list. Throws an exception if the list is empty
         * @param list Generic list of numeric elements, of which find the max
         * @return the maximum element in the list
         * @throws IndexOutOfBoundExceptions if the list is empty
         * */
    public static <T extends Comparable<T>> CNumber<T> max(List<CNumber<T>> list){
        if(list.isEmpty()){
            throw new IndexOutOfBoundsException("Trying to find max number in empty list");
        }
        var max = list.get(0);
        for (var el : list){
            if (el.compareTo(max) > 0){
                max =el;
            }
        }
        return max;
    }
}
