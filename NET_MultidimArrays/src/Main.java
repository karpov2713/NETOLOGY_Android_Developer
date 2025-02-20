import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Одномерный массив

        int[][] arr2 = new int[3][5];
//        arr2[0] = new int[1];
//        arr2[1] = new int[4];
//        arr2[2] = new int[2];
        arr2[1][3] = 15;
        System.out.println(arr2[1][3]);

        int[][] arr3 = {
                new int[1],
                new int[4],
                new int[2]
        };

        int[][] arr4 = {
                {1},
                {22, 222},
                {333, 345, 478}
        };

        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));

        for (int i = 0; i < arr4.length; i++) {
            //int[] tmp = arr4[i];
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] arr5 = new int[10][20][5]; // Трехмерный массив
    }
}