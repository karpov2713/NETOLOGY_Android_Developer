public abstract class Transport implements Transferer, Billable {
    public int fuel;

    public Transport(int fuel){
        this.fuel = fuel;
    }

    public void spendFuel(int fuel){
        this.fuel -= fuel;
    }

    @Override
    public void pay(int amount) {

    }

    //public abstract void transfer(String name, String from, String to);
}
