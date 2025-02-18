import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 5;
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr));

        // Заполняем ячейки массива
        arr[1] = 3;
        arr[2] = 15;
        arr[3] = 100;
        arr[4] = 1;
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {5, 3, 15, 100, 1};
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr == arr2); // false
        System.out.println(arr.equals(arr2)); // false работает как = =
        System.out.println(Arrays.equals(arr, arr2)); // true

        String[] arrStr = {"Petya", "Olga", "Tanya"};

        Singer[] arrSing = {
                new Singer("Petya", 8),
                new Singer("Tanya", 15, 4)
        };
    }
}