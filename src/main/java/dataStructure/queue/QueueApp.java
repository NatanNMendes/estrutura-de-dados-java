package dataStructure.queue;

public class QueueApp {

    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);

//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLenght();
//        myQueue.print();
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLenght();
//        myQueue.print();

    }

}
