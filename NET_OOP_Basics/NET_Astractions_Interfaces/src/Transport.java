public abstract class Transport implements Transferer, Billable {
    private int fuel;

    // Начальное количество топлива
    public Transport(int fuel) {
        this.fuel = fuel;
    }

    // Расчет остаточного количества, учет расхода топлива
    public void spendFuel(int fuel) {
        this.fuel -= fuel;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Уплачено в размере " + amount);
    }
}
