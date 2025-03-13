public class CreditAccount extends Account{

    private long creditLimit;

    public CreditAccount(long creditLimit){
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if balance
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
        return creditLimit;
    }
}
