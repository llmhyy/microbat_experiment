package exp.datarace;

public class DataRaces {
    public static void main(String[] args) {
        UseCounter c = new UseCounter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();

        Counter.count = 100;

    }
}
class Counter {
    public static int count = 1;
}

class UseCounter implements Runnable {    
    public static void increment() {
    	int a= 2;
    	a=a+Counter.count;
        System.out.print(a + " ");
    }    
    public void run() {
        increment();
    }    
}

