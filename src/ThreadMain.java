import thread.NameThread;

public class ThreadMain {
    public static void main(String[] args)  {

        Thread thread=new NameThread("Craig Kem");
        thread.start();

        NameThread thread1 = new NameThread("Jeremy Benjamin");
        thread1.start();


        NameThread thread2=new NameThread("Rick Greg");
        thread2.start();

        System.out.println(thread.getState());
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
    }
}

