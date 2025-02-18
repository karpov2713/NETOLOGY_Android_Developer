import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

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
        String[] names = {
                "Petya",
                "Olga",
                "Anya",
                "Pavel",
                "Oleg"
        };

        for (int i = 0; i < names.length; i++) {
            if (!names[i].startsWith("P")) {
                System.out.println(names[i]);
            }
        }
        System.out.println("---------------------------------"); // Далее цикл foreach;

        for (String name : names) {
            if (!name.startsWith("P")) {
                System.out.println(name);
            }
        }
        System.out.println("---------------------------------"); // Далее сортировка массива

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("---------------------------------");

        String[] names2 = names;
        names2[0] = null;
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names2));
        System.out.println("---------------------------------");

        String[] names3 = names.clone();
        names3[1] = null;
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names3));
    }
}