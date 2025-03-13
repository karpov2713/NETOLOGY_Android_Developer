public class CreditAccount extends Account{

    public long creditLimit;

    public CreditAccount(long creditLimit){
        this.creditLimit = creditLimit;
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
        return creditLimit;
    }
}
