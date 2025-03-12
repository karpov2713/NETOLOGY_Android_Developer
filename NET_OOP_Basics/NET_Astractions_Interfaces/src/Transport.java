public abstract class Transport {
    public int fuel;

    public Transport(int fuel){
        this.fuel = fuel;
    }

    public void spendFuel(int fuel){
        this.fuel -= fuel;
    }

    public void transfer(String name, String from, String to){

    }
}
