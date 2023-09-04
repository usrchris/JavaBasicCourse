import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.println("Введите математическое действие (+, -, * или /): ");
         char operation = scanner.next().charAt(0);
         double result;

         switch (operation) {
             case '+' : result = number1 + number2; break;
             case '-' : result = number1 - number2; break;
             case '*' : result = number1 * number2; break;
             case '/' : result = number1 / number2; break;
             default: System.out.println("Ошибка, введите корректный оператор"); return;
         }
         System.out.println("Результат операции = " + result);

    }
}