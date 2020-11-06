public class Main {
    public static void main(String[] args) {
        Counter firstCounter = new Counter(100);
        Counter secondCounter = new Counter(100);
        Thread thread = new ThreadImpl(firstCounter);
        Thread runnable = new Thread(new RunnableImpl(secondCounter));
        thread.start();
        runnable.start();
    }
}
