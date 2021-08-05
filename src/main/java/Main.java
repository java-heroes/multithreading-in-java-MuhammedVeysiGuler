class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {

        System.out.println(getName() + " çalışıyor.");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
                System.out.println("In " + getName() + " sayısı " + i);
            } catch (InterruptedException e) {
                System.out.println(getName() + " kesildi");
            }
        }
        System.out.println(getName() + " sonlandı");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread çalıştı");

        MyThread myThread = new MyThread("ch1");
        MyThread myThread2 = new MyThread("ch2");
        MyThread myThread3 = new MyThread("ch3");

        myThread.start();
        myThread2.start();
        myThread3.start();

        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread kesildi");
            }
        }

        System.out.println("Main thread sonlandı");
    }
}