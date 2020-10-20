package exp.concurrency.case2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SequentialPrinting {
    private int times;
    private int state;
    private Lock lock = new ReentrantLock();

    public SequentialPrinting(int times) {
        this.times = times;
    }

    public void printA() {
        print("A", 0);
    }

    public void printB() {
        print("B", 1);
    }

    public void printC() {
        print("C", 2);
    }

    private void print(String name, int targetState) {
        for (int i = 0; i < times;) {
            lock.lock();
            if (state % 3 == targetState) {
                state++;
                i++;
                System.out.print(name);
            }
            lock.unlock();
        }
    }
}