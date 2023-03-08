package lab3.ES.es1;

import java.util.ArrayList;
import java.util.Random;
public class QueueApp {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList <Integer> numbers = new ArrayList<>();
        Queue<Integer> queue = new Queue<>(numbers);
        System.out.println("The queue is empty? " + queue.empty());
        for (int i = 0; i < 10; i++) {
            queue.enqueue(r.nextInt(10));
        }
        queue.print();
        for (int i = 0; i < 10; i++) {
            if(r.nextFloat() > 0.5){
                queue.enqueue(r.nextInt(100));
                queue.print();
            }else{
                System.out.println("Removed " + queue.dequeue());
            }
        }
        System.out.println("\n Final result: ");
        queue.print();
        System.out.println("The queue is empty? " + queue.empty());
    }
}
