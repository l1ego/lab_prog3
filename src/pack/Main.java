package pack;

import pack.PrinterNumbers;

public class Main {
    public static void main(String[] args) {
        PrinterNumbers p = new PrinterNumbers();
        printNumbers(100, p);
        printNumbers(30, p);

    }

    private static void printNumbers(int x, PrinterNumbers p) {
        for (int i = 0; i < x; i++) {
            p.printNumber(i);
        }
    }
}