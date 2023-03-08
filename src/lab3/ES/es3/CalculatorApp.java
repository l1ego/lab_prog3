package lab3.ES.es3;

import java.util.ArrayList;
import java.util.Random;

public class CalculatorApp {
    /*
     *Abstract class for the Factory of Cnumber.
     *Concrete subclass must implode the randomInstance method
     *@ param <T>
     */
    abstract static class RandomFactory<T extends Comparable<T>> {
        Random r;
        RandomFactory() {
            r = new Random();
        }
        /*
        * @return A random CNumber
        * */
        public abstract Calculator.CNumber<T> randomInstance();
    }

    /*
    * Makes a random instance of CNumber<Integer>
    * */
    static class CIntFactory extends RandomFactory<Integer>{
        public Calculator.CNumber<Integer> randomInstance(){
            return new CInt(r.nextInt(100));
        }
    }
    static class CInt extends Calculator.CNumber<Integer>{
        CInt(Integer number){
            super(number);
        }

        @Override
        public Calculator.CNumber<Integer> add(Calculator.CNumber<Integer> other) {
            CInt otherInt = (CInt) other;
            return new CInt(number + otherInt.number);
        }

    }

    /*
    * Makes a random instance of CNumber<Float>
    * */
    static class CFloatFactory extends RandomFactory<Float>{
        public Calculator.CNumber<Float> randomInstance(){
            return new CFloat(r.nextFloat());
        }
    }
    static class CFloat extends Calculator.CNumber<Float>{
        CFloat(Float number){
            super(number);
        }

        @Override
        public Calculator.CNumber<Float> add(Calculator.CNumber<Float> other) {
            CFloat otherFloat = (CFloat) other;
            return new CFloat(number + otherFloat.number);
        }

    }

    /*
     * Makes a random instance of CNumber<Double>
     * */
    static class CDoubleFactory extends RandomFactory<Double>{
        public Calculator.CNumber<Double> randomInstance(){
            return new CDouble(r.nextDouble());
        }
    }
    static class CDouble extends Calculator.CNumber<Double>{
        CDouble(Double number){
            super(number);
        }

        @Override
        public Calculator.CNumber<Double> add(Calculator.CNumber<Double> other) {
            CDouble otherDouble = (CDouble) other;
            return new CDouble(number + otherDouble.number);
        }

    }

    /*
    * Creates a list of a random T numeric items and calculate summation and maximum value.
    * @param gn Implementation of the GetRandomNumber<T> interface that
    * provides a method for obtaining random T type numbers
    * */
    private static <T extends Comparable<T>> void processNumbers(RandomFactory<T> gn){
        ArrayList<Calculator.CNumber<T>> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(gn.randomInstance());
        }
        Calculator.printNumbers(numbers);
        System.out.println("Max: " + Calculator.max(numbers) +
                            "; Tot: " + Calculator.max(numbers));
        System.out.println();
    }

    /*
    *  Call processNumbers() method three times to do operations
    * on lists of elements of type int, double and float respectively.
    * */
    public static void main(String[] args) {
        Random r = new Random();
        processNumbers(new CIntFactory());
        processNumbers(new CFloatFactory());
        processNumbers(new CDoubleFactory());
    }
}
