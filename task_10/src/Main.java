import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк в матрице: ");

        int x = input.nextInt();

        System.out.println("Введите количество столбцов в матрице: ");

        int y = input.nextInt();

        int[][] matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Строка " + (i+1) + ", столбец " + (j+1) + " Введите значение: ");
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < y; i++) {
            System.out.print(matrix[0][i] * 3 + " ");
        }

    }
}
