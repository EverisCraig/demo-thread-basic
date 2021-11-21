package runnable;

public class TourStack implements  Runnable{

    private String name;

    public TourStack(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {

        for (int i=0; i<10;i++){
            System.out.println(i + " - "+ name);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finalize thread : "+ name);
    }
}
