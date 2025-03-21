import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        String[] operations = new String[5];
        operations[0] = "Выход из программы";
        operations[1] = "Добавить дело";
        operations[2] = "Показать дела";
        operations[3] = "Удалить дело по номеру";
        operations[4] = "Удалить дело по названию";

        System.out.print("Выберите операцию:");
        System.out.println();

        for (int i = 0; i < operations.length; i++) {
            System.out.println(i + ". " + operations[i]);
        }

        while (true) {
            System.out.print("Выберите операцию: ");
            int number = scInt.nextInt();

            if (number == 1) {
                System.out.print("Введите название задачи: ");
                tasks.add(scStr.nextLine());
                System.out.println("Добавлено!");
                tasksInfo(tasks);
            } else if (number == 2) {
                tasksInfo(tasks);
            } else if (number == 3) {
                System.out.print("Введите номер для удаления: ");
                int index = scInt.nextInt();
                if (index < 1 || index > (tasks.size())) {
                    System.out.println("В списке нет дела с таким номером!");
                    tasksInfo(tasks);
                } else {
                    tasks.remove(index - 1);
                    System.out.println("Удалено!");
                    tasksInfo(tasks);
                }
            } else if (number == 4) {
                System.out.println("Введите задачу для удаления: ");
                if (tasks.remove(scStr.nextLine())) {
                    System.out.println("Удалено!");
                    tasksInfo(tasks);
                } else {
                    System.out.println("У вас нет такой задачи!");
                    tasksInfo(tasks);
                }
            } else if (number == 0) {
                tasksInfo(tasks);
                System.out.println("Программа завершена!");
                break;
            }
        }
    }

    public static void tasksInfo(List<String> tasks) {
        if (!tasks.isEmpty()) {
            System.out.println("Ваш список дел:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        } else {
            System.out.println("У вас нет никаких дел в списке!");
        }
    }
}