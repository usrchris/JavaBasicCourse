import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущий курс доллара: ");
        double dollar_exchange = scanner.nextDouble();

        System.out.print("Введите количество рублей: ");
        double roubles = scanner.nextDouble();

        double total = Math.round((roubles * dollar_exchange) * 100.0) / 100.0;

        System.out.println("Курс доллара: " + dollar_exchange + "\nКоличество рублей: " + roubles + "\nИтого: " + total);

    }
}