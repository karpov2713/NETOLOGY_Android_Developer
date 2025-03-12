public class Main {

    public static void main(String[] args) {
        String name = "Petya";

        Car car = new Car();
        System.out.println(car.fuel);
        spbToMoscow(name, car);

        Ship ship = new Ship();
        ship.transfer(name, "SPB", "MSK");
    }

    public static void spbToMoscow(String name, Transport transport){
        transport.transfer(name, "SPB", "MSK");
    }

}