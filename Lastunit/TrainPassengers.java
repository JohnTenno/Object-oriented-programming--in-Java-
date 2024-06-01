import java.util.concurrent.atomic.*;

class Train extends Thread {
    private int passengers;
    private AtomicInteger currentPassengers;
    @Override
    public void run() {
        for (int i = 1; i <= passengers; i++) {
            currentPassengers.incrementAndGet();
            System.out.println("Numero de pasajeros en los trenes: " + currentPassengers);
            try {
            Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Numero de pasajeros en " + 
            Thread.currentThread().getName() + " es: " + passengers);
    }
    public Train(int passengers, AtomicInteger current) {
        this.passengers = passengers;
        this.currentPassengers = current;
    }
    public Train(){}
}

public class TrainPassengers {
    public static void main(String[] args) {
        AtomicInteger currentPassengers = new AtomicInteger(); 
        Train train1 = new Train(9, currentPassengers);
        train1.setName("Tren 1");
        Train train2 = new Train(4, currentPassengers);
        train2.setName("Tren 2");

        train1.start();
        try {
            train1.join(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        train2.start();
    }
}
