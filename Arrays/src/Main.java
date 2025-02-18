import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] arr = new int[5];
//        arr[0] = 5;
//        System.out.println(arr[0]);
//        System.out.println(arr[4]);
//        System.out.println(Arrays.toString(arr));
//
//        // Заполняем ячейки массива
//        arr[1] = 3;
//        arr[2] = 15;
//        arr[3] = 100;
//        arr[4] = 1;
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr2 = {5, 3, 15, 100, 1};
//        System.out.println(Arrays.toString(arr2));
//
//        System.out.println(arr == arr2); // false
//        System.out.println(arr.equals(arr2)); // false работает как = =
//        System.out.println(Arrays.equals(arr, arr2)); // true

//        String[] arrStr = {"Petya", "Olga", "Tanya"};
//
//        Singer[] arrSing = {
//                new Singer("Petya", 8),
//                new Singer("Tanya", 15, 4)

//        };
//        String[] names = {
//                "Petya",
//                "Olga",
//                "Anya",
//                "Pavel",
//                "Oleg"
//        };
//
//        for (int i = 0; i < names.length; i++) {
//            if (!names[i].startsWith("P")) {
//                System.out.println(names[i]);
//            }
//        }
//        System.out.println("---------------------------------"); // Далее цикл foreach;
//
//        for (String name : names) {
//            if (!name.startsWith("P")) {
//                System.out.println(name);
//            }
//        }
//        System.out.println("---------------------------------"); // Далее сортировка массива
//
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));
//        System.out.println("---------------------------------");

//        String[] names2 = names;
//        names2[0] = null;
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(names2));
//        System.out.println("---------------------------------");
//
//        String[] names3 = names.clone();
//        names3[1] = null;
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(names3));

        // Массивы 4 - практическое занятие

        int[] temps = new int[30]; // Массив со значениями за 30 дней месяца
        boolean[] isFilled = new boolean[30]; // все ячейки заполнены false
        while (true) {
            System.out.println("Введите два числа: дата температура"); // 11 31
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            String[] parts = input.split(" ");
            int day = Integer.parseInt(parts[0]) - 1;
            int t = Integer.parseInt(parts[1]);
            temps[day] = t;
            isFilled[day] = true;

            double sum = 0;
            for (int tt : temps) {
                sum += tt;
            }
            int cnt = 0;
            for (boolean f : isFilled) {
                if (f) {
                    cnt++;
                }
            }
            System.out.println("Средняя температура: " + (sum / cnt));
        }

    }
}