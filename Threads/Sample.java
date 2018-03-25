import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Simple Java program to demonstrate How to use wait, notify and notifyAll()
 * method in Java by solving producer consumer problem.
 * 
 * @author Javin Paul
 */
class Sample {

    public static void main(String args[]) {
        System.out.println("How to use wait and notify method in Java");
        System.out.println("Solving Producer Consumper Problem");

        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 2;

        Thread producer = new Producer(buffer, maxSize, "PRODUCER");
        Thread producer1 = new Producer(buffer, maxSize, "PRODUCER1");
        Thread producer2 = new Producer(buffer, maxSize, "PRODUCER2");
        Thread producer3 = new Producer(buffer, maxSize, "PRODUCER3");
        Thread producer4 = new Producer(buffer, maxSize, "PRODUCER2");
        Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
        Thread consumer1 = new Consumer(buffer, maxSize, "CONSUMER1");

        producer.start();
        producer1.start();
        producer2.start();
        producer3.start();
        producer4.start();
        consumer.start();
        consumer1.start();
    }

}

/**
 * Producer Thread will keep producing values for Consumer
 * to consumer. It will use wait() method when Queue is full
 * and use notify() method to send notification to Consumer
 * Thread.
 * 
 * @author WINDOWS 8
 *
 */
class Producer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;

    public Producer(Queue<Integer> queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    try {
                        System.out.println("Queue is full, " + "Producer thread waiting for "
                                + "consumer to take something from queue "+Thread.currentThread().getName());
                        queue.wait();
                        count++;
                        if(count == 5){
                            break;
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                Random random = new Random();
                int i = random.nextInt();
                System.out.println("Producing value : " + i);
                queue.add(i);
                queue.notifyAll();
            }
            if(count == 5){
                break;
            }

        }
    }
}

/**
 * Consumer Thread will consumer values form shared queue.
 * It will also use wait() method to wait if queue is
 * empty. It will also use notify method to send 
 * notification to producer thread after consuming values
 * from queue.
 * 
 * @author WINDOWS 8
 *
 */
class Consumer extends Thread {
    private Queue<Integer> queue;
    private int maxSize;

    public Consumer(Queue<Integer> queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        int count = 0; 
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println("Queue is empty," + "Consumer thread is waiting"
                            + " for producer thread to put something in queue "+Thread.currentThread().getName());
                    try {
                        queue.wait();
                        count++;
                        if(count == 5){
                            break;
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                }
                System.out.println("Consuming value : " + queue.remove());
                queue.notifyAll();
            }
            if(count == 5){
                break;
            }

        }
    }
}