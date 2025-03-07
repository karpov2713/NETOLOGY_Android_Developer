import taxes.TaxSystem;

public class Company {

    public String title;
    public int debit;
    public int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        System.out.println("Компания: " + title + " уплатила налог в размере: " +
                taxSystem.calcTaxFor(debit, credit) + " руб.");
        this.debit = 0;
        this.credit = 0;
    }
}
