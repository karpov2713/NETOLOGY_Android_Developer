public class CreditAccount extends Account{

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

    @Override
    public void getBalance() {

    }
}
