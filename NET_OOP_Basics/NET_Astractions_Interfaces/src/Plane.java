public class Plane extends Transport {

    public Plane() {
        super(10_000);
    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println("Пассажир " + name + " полетел на PLANE из " + from + " в " + to);
        spendFuel(300);
    }
}
