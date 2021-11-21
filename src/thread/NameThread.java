package thread;

public class NameThread extends Thread {
    public NameThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("init run thread " + getName());

        for (int i = 0; i < 10; i++)
            System.out.println(this.getName());
        System.out.println("finalize thread");

    }
}
