package metanit;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("cid2373", 5000);
        Account acc2 = new Account(53753, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());

//        Printer printer = new Printer();
//        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
//        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
//        printer.<String>print(people);
//        printer.<Integer>print(numbers);
    }
}