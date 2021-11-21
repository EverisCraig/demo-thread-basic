import runnable.TourStack;

public class Example {
    public static void main(String[] args) {
        new Thread(new TourStack("easter island")).start();
        new Thread(new TourStack("Robinson Crusoe")).start();
        new Thread(new TourStack("Juan Fernandez")).start();
        new Thread(new TourStack("Chiloe island")).start();
    }
}
