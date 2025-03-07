import taxes.TaxSystem;
import taxes.USN_15;
import taxes.USN_6;

public class Main {
    public static void main(String[] args) {
        TaxSystem taxSystem = new TaxSystem();
        Company company = new Company("ABC", taxSystem);

        company.setTaxSystem(new USN_15());
        company.shiftMoney(1000);
        company.shiftMoney(-300);
        company.payTaxes();

        company.setTaxSystem(new USN_6());
        company.shiftMoney(9000);
        company.payTaxes();

        company.setTaxSystem(new USN_15());
        company.shiftMoney(1000);
        company.shiftMoney(-7000);
        company.payTaxes();
    }
}