class DoubleBox<T> {
    public RandomBox<T> first;
    public RandomBox<T> second;
    private static int count = 0;

    public boolean put(int key, T value) {
        if (first == null) {
            this.first = new RandomBox<>(key, value);
            count++;
            return true;
        } else if (second == null) {
            this.second = new RandomBox<>(key, value);
            count++;
            return true;
        } else {
            return false;
        }
    }

    public T get(int key) {
        if (first != null && key == first.getKey()) {
            return first.tryUnlock(key);
        } else if (second != null && key == second.getKey()) {
            return second.tryUnlock(key);
        } else {
            return null;
        }
    }

    public int size() {
        return count;
    }
}
