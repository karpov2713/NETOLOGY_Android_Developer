public class Velo implements Transferer {

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println("Пассажир " + name + " прокатился на VELO из " + from + " в " + to);
    }
}
