import taxes.TaxSystem;
import taxes.USN_15;
import taxes.USN_6;

public class Main {
    public static void main(String[] args) {

        TaxSystem taxSystem = new USN_15();
        Company company = new Company("ABC", taxSystem);

        company.shiftMoney(1000);
        company.shiftMoney(-300);
        company.payTaxes(company.debit, company.credit);

        company.setTaxSystem(new USN_6());
        company.shiftMoney(9000);
        company.payTaxes(company.debit, company.credit);
    }
}