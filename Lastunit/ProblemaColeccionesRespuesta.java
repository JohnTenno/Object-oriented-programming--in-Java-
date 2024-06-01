import java.util.concurrent.*;

public class Collections {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        Consumer consumer = new Consumer(blockingQueue);
        Cook cook = new Cook(blockingQueue);

        Thread cook1 = new Thread(cook);
        Thread consumer1 = new Thread(consumer);
        cook1.start();
        consumer1.start();
    }
}

class Consumer implements Runnable {
    BlockingQueue<String> blockingQueue = null;

    public Consumer(BlockingQueue<String> queue) {
        this.blockingQueue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while(true) {
            try {
                this.blockingQueue.put("Cliente " + i);
                System.out.println("Cliente " + i + " agregado");
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            i++;
        }
    }
}

class Cook implements Runnable {
    BlockingQueue<String> blockingQueue = null;

    public Cook(BlockingQueue<String> queue) {
        this.blockingQueue = queue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                String element = this.blockingQueue.take();
                System.out.println("Se atendio a el " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

