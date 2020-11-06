import lombok.extern.log4j.Log4j;

@Log4j
public class ThreadImpl extends Thread {
    private Counter counter;

    public ThreadImpl(Counter counter) {
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
