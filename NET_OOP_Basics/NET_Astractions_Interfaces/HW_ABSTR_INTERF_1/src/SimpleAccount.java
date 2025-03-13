public class SimpleAccount extends Account {

    public SimpleAccount(long amount){
        this.amount = amount;
    }

    @Override
    public boolean add(long amount) {
        return false;
    }

    @Override
    public boolean pay(long amount) {
        return false;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        return false;
    }

    public long getBalance(){
        return amount;
    }
}
