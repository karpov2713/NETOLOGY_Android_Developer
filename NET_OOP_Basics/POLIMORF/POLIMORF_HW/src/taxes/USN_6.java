package taxes;

public class USN_6 extends TaxSystem {
    public final int NALOG = 6;

    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit / 100 * NALOG;
    }
}
