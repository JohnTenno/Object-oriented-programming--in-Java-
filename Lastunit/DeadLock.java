import java.util.concurrent.locks.*;

public class DeadLock {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Runnable runnable1 = new SomeClass(lock1, lock2);
        Runnable runnable2 = new SomeOtherClass(lock1, lock2);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
        }
        thread2.start();
    }
}

class SomeClass implements Runnable {
    private Lock lock1 = null;
    private Lock lock2 = null;

    public SomeClass(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(name + " bloqueando lock1");
        lock1.lock();
        System.out.println(name + " lock1 bloqueado");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        System.out.println(name + " bloqueando lock2");
        lock2.lock();
        System.out.println(name + " lock2 bloqueado");

        System.out.println(name + " liberando lock1");
        lock1.unlock();
        System.out.println(name + " liberando lock2");
        lock2.unlock();
    }
}

class SomeOtherClass implements Runnable {
    private Lock lock1 = null;
    private Lock lock2 = null;

    public SomeOtherClass(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(name + " bloqueando lock2");
        lock2.lock();
        System.out.println(name + " lock2 bloqueado");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        System.out.println(name + " bloqueando lock1");
        lock1.lock();
        System.out.println(name + " lock1 bloqueado");

        System.out.println(name + " liberando lock1");
        lock1.unlock();
        System.out.println(name + " liberando lock2");
        lock2.unlock();
    }
}
