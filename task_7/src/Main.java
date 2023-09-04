import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        int z = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();

        if (size < 1) {
            System.out.println("Ошибка. Введите число больше 1");
            return;
        }

        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Элемент номер " + (i + 1) + ": ");
            array[i] = input.nextInt();
            if (array[i] == x | array[i] == y | array[i] == z ) {
                System.out.print("Данное значение имеется в константах");
            }
        }
    }
}