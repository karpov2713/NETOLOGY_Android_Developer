public class Car extends Transport {

    public Car() {
        super(100);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println("Пассажир " + name + " поехал на CAR из " + from + " в " + to);
        spendFuel(10);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Уплачено в размере " + amount);
    }
}
