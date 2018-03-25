import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Lift {

    public static void main(String[] args) throws InterruptedException {
        LinkedList queue = new LinkedList<Integer>();
        Thread t1 = new Thread(new LiftUp(queue));
        t1.start();
    }
}

class LiftUp implements Runnable {
    LinkedList queue = new LinkedList<Integer>();
    int count = 1;
    Random random = new Random();
    public LiftUp(LinkedList queue){
        this.queue = queue;
    }

    public void run() {
        while(true){
            queue.clear();
            count = 1;
            int floor = random.nextInt(12);
            while (count <= floor) {
                System.out.println("Floor"+count);
                System.out.println();
                queue.add(count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                count++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            for (int i = (floor - 2); i >= 0; i--) {
                // System.out.println(queue.size());
                System.out.println("Floor"+queue.get(i));
                System.out.println();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println("Floor" + 0);
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }    
    }
}