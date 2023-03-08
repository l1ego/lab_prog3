package lab3.ES.es1;

import java.util.List;

class Queue<T> {
    private List<T> c;

    /*
    * Class constructor
    * @param c The list used from the queue
    * */
    public Queue(List<T> c){
        this.c = c;
    }

    /*
    * Removes the first element of the queue and return this one.
    * If the queue is empty, return null.
    * @return the removed element, null if the queue is empty.
    * */
    public T dequeue(){
        T ris = null;
        if(c.size() > 0){
            ris = c.remove(0);
        }
        return ris;
    }

    /*
    * Inserts a new T element at the bottom of the queue
    * @param el The element to added at the queue
    * */
    public void enqueue(T el){
        c.add(el);
    }

    /*
    * return if the queue is empty or not
    * @return true if the queue is empty, false otherwise
    * */
    public boolean empty(){
        return c.size() == 0;
    }

    /*
    * print the queue content
    * */
    public void print(){
        for (T t : c){
            System.out.println(t + ", ");
        }
        System.out.println();
    }

}
