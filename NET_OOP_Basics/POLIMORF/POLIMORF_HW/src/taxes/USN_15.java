package taxes;

public class USN_15 extends TaxSystem {
    public final int NALOG = 15;

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit - credit) <= 0 ? 0 : (debit - credit) / 100 * NALOG;
    }
}
