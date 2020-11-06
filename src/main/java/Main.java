public class Main {
    private static final int MAX_COUNTER_VALUE = 100;

    public static void main(String[] args) {
        Counter counter = new Counter(MAX_COUNTER_VALUE);
        Thread thread = new ThreadImpl(counter);
        Thread runnable = new Thread(new RunnableImpl(counter));
        thread.start();
        runnable.start();
    }
}
