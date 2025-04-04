import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Address, Integer> addressCost = new HashMap<>();
        addressCost.put(new Address("Россия", "Москва"), 500);
        addressCost.put(new Address("Россия", "Петербург"), 300);
        addressCost.put(new Address("Россия", "Казань"), 400);
        addressCost.put(new Address("Россия", "Новгород"), 600);
        addressCost.put(new Address("Турция", "Анкара"), 1500);
        addressCost.put(new Address("Китай", "Пекин"), 2600);

        int totalCost = 0;
        Set<String> countries = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            String country = scan.nextLine();
            if (country.equals("end")) {
                break;
            }
            System.out.print("Введите город: ");
            String city = scan.nextLine();
            System.out.print("Введите вес (кг): ");
            int weight = Integer.parseInt(scan.nextLine());

            Address address = new Address(country, city);
            if(addressCost.containsKey(address)){
                int cost = weight * addressCost.get(address);
                totalCost += cost;
                countries.add(country);

                System.out.printf("Стоимость доставки составит: %d руб.\n", cost);
                System.out.printf("Общая стоимость всех доставок составит: %d руб.\n", totalCost);
                System.out.printf("Количество посещенных стран: %d.\n", countries.size());

            } else {
                System.out.println("Доставки по этому адресу нет");
            }
        }

    }
}