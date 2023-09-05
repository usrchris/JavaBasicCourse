import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = input.nextLine();
        text = text
                .replaceAll("[^a-zA-Z]+", " ")
                .trim();

        System.out.println(text);

        String[] count = text.split(" ");
        System.out.println(count.length);

    }
}