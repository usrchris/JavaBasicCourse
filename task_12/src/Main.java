import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = input.nextLine();

        if (text.contains("Java") && text.startsWith("I like") && text.endsWith("!!!")) {
            System.out.println(text.toUpperCase());
            System.out.println(text.replace('a','o').substring(7, 11));
        }
        else {
            System.out.println("Вы не любите Java");
        }
    }
}