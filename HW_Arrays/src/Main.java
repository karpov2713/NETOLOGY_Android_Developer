import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int[] orders = new int[3];

        int sumProduct = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        while (true) {
            System.out.println("Введите номер продукта и его количество, для выхода наберите \"end\": ");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            String[] parts = input.split(" ");
            int number = Integer.parseInt(parts[0]) - 1;
            int count = Integer.parseInt(parts[1]);
            orders[number] = orders[number] + (count * prices[number]);
            sumProduct = sumProduct + orders[number];
        }

        for (int i = 0; i < orders.length; i++) { // Выводим в консоль только купленные товары.
            if (orders[i] != 0) {
                System.out.println(products[i] + " " + prices[i] + " руб/шт " + orders[i] + " руб в сумме.");
            }
        }
        System.out.println("Итого " + sumProduct + " руб");
    }
}