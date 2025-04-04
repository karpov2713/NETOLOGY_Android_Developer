public class Memory<T> implements Saveable<T> {
    protected T value;

    public void save(T value) {
        this.value = value;
    }

    public T getLast() {
        return value;
    }
}
