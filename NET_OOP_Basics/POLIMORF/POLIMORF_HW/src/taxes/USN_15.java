package taxes;

public class USN_15 extends TaxSystem {
    private final int NALOG = 15;

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit - credit) <= 0 ? 0 : (debit - credit) / 100 * NALOG;
    }
}
