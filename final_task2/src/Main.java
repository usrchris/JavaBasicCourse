import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();

        if(!expression.matches("^x[+-][0-9]=[0-9]|[0-9][+-]x=[0-9]|[0-9][+-][0-9]=x$")) {
            System.out.println("Я не буду ЭТО решать!");
            return;
        }

        int a, b, x = 0;

        switch (expression.indexOf('x'))
        {
            case 0:
                a = Integer.parseInt(String.valueOf(expression.charAt(2)));
                b = Integer.parseInt(String.valueOf(expression.charAt(4)));
                x = expression.charAt(1) == '+'? b - a: a + b;
                break;
            case 2:
                a = Integer.parseInt(String.valueOf(expression.charAt(0)));
                b = Integer.parseInt(String.valueOf(expression.charAt(4)));
                x = expression.charAt(1) == '+'? b - a: a - b;
                break;
            case 4:
                a = Integer.parseInt(String.valueOf(expression.charAt(0)));
                b = Integer.parseInt(String.valueOf(expression.charAt(2)));
                x = expression.charAt(1) == '+'? a + b: a - b;
                break;
        }
        System.out.println("Вывод: " + x);
    }
}
