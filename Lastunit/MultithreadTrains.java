class Train extends Thread {
    private int endPoint;
    private int currentTrainStop;

    @Override
    public void run() {
        System.out.println("El " + Thread.currentThread().getName() +
                " empezo en: " + currentTrainStop);
        for (int i = currentTrainStop; i <= endPoint; i++) {
            System.out.println("El " + Thread.currentThread().getName() +
                    " se encuentra en la parada " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("El tren se detuvo en: " + endPoint);
    }

    public Train(int start, int end) {
        this.currentTrainStop = start;
        this.endPoint = end;
    }

    public Train() {
    }
}

public class MultithreadTrains {
    public static void main(String[] args) {
        Train train1 = new Train(1, 6);
        Train train2 = new Train(6, 19);

        train1.start();
        train1.setName("Tren 1");
        train2.start();
        train2.setName("Tren 2");
    }
}
