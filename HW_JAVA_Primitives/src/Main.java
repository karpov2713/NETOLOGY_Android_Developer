import java.util.Scanner;

public class Main {

    public static int usnEarningsOnly(int earnings) {
        return earnings * 6 / 100;
    }

    public static int usnEarningsMinusExpenses(int earnings, int expenses) {
        return (earnings - expenses) * 15 / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int expenses = 0;

        while (true) {
            System.out.println("Выберите операцию и введите ее номер: ");
            System.out.println("1 - Добавить новы доход");
            System.out.println("2 - Добавить новы расход");
            System.out.println("3 - Выбрать систему налогообложения");
            System.out.println("Для выхода из программы введите - end");

            String input = scanner.nextLine();

            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);
            String moneyStr;
            int money = 0;

            switch (operation) {
                case 1:
                    System.out.print("Введите суму дохода: ");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.print("Введите суму расхода: ");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    expenses += money;
                    break;
                case 3:
                    int taxEarningsOnly = usnEarningsOnly(earnings);
                    int taxEarningsMinusExpenses = usnEarningsMinusExpenses(earnings, expenses);
                    if (taxEarningsOnly < taxEarningsMinusExpenses) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + taxEarningsOnly + " рублей");
                        System.out.println("Налог по другой системе: " + taxEarningsMinusExpenses + " рублей");
                        System.out.println("Экономия: " + (taxEarningsMinusExpenses - taxEarningsOnly) + " рублей");
                        earnings = 0;
                        expenses = 0;
                    } else if (taxEarningsOnly > taxEarningsMinusExpenses) {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + taxEarningsMinusExpenses + " рублей");
                        System.out.println("Налог по другой системе: " + taxEarningsOnly + " рублей");
                        System.out.println("Экономия: " + (taxEarningsOnly - taxEarningsMinusExpenses) + " рублей");
                        earnings = 0;
                        expenses = 0;
                    } else {
                        System.out.println("Налоги в обеих системах равны");
                        System.out.println("Можете выбрать любую систему налогообложения");
                        earnings = 0;
                        expenses = 0;
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена");
    }
}