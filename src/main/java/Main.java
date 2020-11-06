public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(100);
        Thread thread = new ThreadImpl(counter);
        Thread runnable = new Thread(new RunnableImpl(counter));
        thread.start();
        runnable.start();
    }
}
