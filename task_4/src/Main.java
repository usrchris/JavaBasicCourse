import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();

        System.out.print("Введите третье число: ");
        double z = scanner.nextDouble();

        double average = (x + y + z) / 3.0;

        System.out.println("Среднее арифметическое чисел " + x + ", " + y + " и " + z + " равно " + average);

        double halfavg = Math.floor(average / 2.0);

        if (halfavg > 3.0) {
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Программа выполнена некорректно, " + halfavg + " не больше " + 3);
        }
    }
}