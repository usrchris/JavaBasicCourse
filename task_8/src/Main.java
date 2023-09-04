import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Введите положительное число!");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= number; i += 2){
            sum += i;
        }

        System.out.println("Сумма чисел равна " + sum);
    }
}