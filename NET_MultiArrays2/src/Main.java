import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int SIZE = 8;

    public static void main(String[] args) {
        Random random = new Random();
        int[][] colors = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        printMatrix(colors);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите угол 90, 180 или 270 поворота матрицы: ");
        String input = scanner.nextLine();
        System.out.println();

        int[][] rotatedColors = new int[SIZE][SIZE];

        switch (input) {
            // Поворот матрицы на 90 градусов по часовой стрелке
            case "90":
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[SIZE - 1 - j][i];
                    }
                }
                printMatrix(rotatedColors);
                break;

            // Поворот матрицы на 180 градусов
            case "180":
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
                    }
                }
                printMatrix(rotatedColors);
                break;

            // Поворот матрицы на 270 градусов по часовой или 90 градусов против часовой стрелки
            case "270":
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                    }
                }
                printMatrix(rotatedColors);
                break;

            default:
                System.out.println("Нет такого расчета!");
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}