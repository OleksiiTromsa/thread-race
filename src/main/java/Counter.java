import lombok.Data;

@Data
public class Counter {
    private int value;
    private int maxValue;

    public Counter(int maxValue) {
        this.maxValue = maxValue;
    }

    public void increment() {
        value++;
    }
}
