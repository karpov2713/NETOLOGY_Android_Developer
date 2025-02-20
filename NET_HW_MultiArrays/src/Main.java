import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите угол 90, 180 или 270 поворота матрицы: ");
        String input = scanner.nextLine();
        System.out.println();

        switch (input) {
            // Поворот матрицы на 90 градусов по часовой стрелке
            case "90":
            int[][] rotatedColors90 = new int[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors90[i][j] = colors[SIZE - 1 - j][i];
                    System.out.format("%4d", rotatedColors90[i][j]);
                }
                System.out.println();
            }
            break;

            // Поворот матрицы на 180 градусов
            case "180":
            int[][] rotatedColors180 = new int[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors180[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
                    System.out.format("%4d", rotatedColors180[i][j]);
                }
                System.out.println();
            }
            break;

            // Поворот матрицы на 270 градусов по часовой или 90 градусов против часовой стрелки
            case "270":
            int[][] rotatedColors270 = new int[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors270[i][j] = colors[j][SIZE - 1 - i];
                    System.out.format("%4d", rotatedColors270[i][j]);
                }
                System.out.println();
            }
            break;
            
            default:
                System.out.println("Нет расчета для такого угла");
        }
    }
}