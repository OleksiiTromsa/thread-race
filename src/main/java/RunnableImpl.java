import lombok.extern.log4j.Log4j;

@Log4j
public class RunnableImpl implements Runnable {
    private Counter counter;

    public RunnableImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() < counter.getMaxValue()) {
            counter.increment();
            log.info(Thread.currentThread().getName() + " " + counter.getValue());
        }
    }
}
