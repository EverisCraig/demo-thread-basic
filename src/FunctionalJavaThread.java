import runnable.TourStack;

public class FunctionalJavaThread {
    public static void main(String[] args) throws InterruptedException {

        Thread main=Thread.currentThread();
        Runnable tour = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 5000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Finalize tour: " + Thread.currentThread().getName());
                System.out.println(main.getState());
            }

        };

//        Runnable tour = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i + " - " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep((long) (Math.random() * 5000));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("Finalize tour: " + Thread.currentThread().getName());
//        };

        new Thread(tour, "easter island").start();
        new Thread(tour, "Robinson Crusoe").start();
        new Thread(tour, "Juan Fernandez").start();

        Thread.sleep(30000);
        System.out.println("Continue main method");

        Thread v1 = new Thread(tour, "easter island");
        Thread v2 = new Thread(tour, "Robinson Crusoe");
        Thread v3 = new Thread(tour, "Juan Fernandez");

        v1.start();
        v2.start();
        v3.start();
        v1.join();
        v2.join();
        v3.join();

        System.out.println("Continue main method");
    }
}
