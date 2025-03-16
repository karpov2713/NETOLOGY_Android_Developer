public class Main {
    static CreditAccount creditAccount = new CreditAccount(-500_000);
    static SimpleAccount simpleAccount = new SimpleAccount();

    public static void main(String[] args) {
        showInfo();
        simpleAccount.add(300_000);
        creditAccount.add((100_000));
        showInfo();
        simpleAccount.pay(400_000);
        creditAccount.pay(300_000);
        showInfo();
        simpleAccount.transfer(creditAccount, 250_000);
        showInfo();
        simpleAccount.add(500_000);
        creditAccount.add(200_000);
        showInfo();


    }

    static void showInfo(){
        System.out.println("На дебетовом счете: "+ simpleAccount.getBalance());
        System.out.println("На кредитном счете: "+ creditAccount.getBalance());
    }
}