import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();

        if (size < 1) {
            System.out.println("Ошибка. Введите число больше 1");
            return;
        }

        double[] array = new double[size];
        double sum = 0;
        double avg = 0;

        System.out.println("Введите элементы массива (double): ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Элемент номер " + (i + 1) + ": ");
            array[i] = input.nextDouble();
            sum += array[i];
        }

        avg = sum / size;
        System.out.println("Среднее арифметическое чисел в массиве = " + avg);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * avg);
        }
    }
}