import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        String number1 = input.next();

        System.out.println("Введите второе число: ");
        int number2 = input.nextInt();

        int biggest = Math.max(Integer.parseInt(number1), number2);
        System.out.println("Большее число: " + biggest);

        double lower = Math.min(Integer.parseInt(number1), number2);

        System.out.println("Меньшее число: " + lower);
    }
}