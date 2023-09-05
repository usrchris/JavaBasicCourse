import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает?");
        int tries = 1;

        do {
            System.out.printf("Попытка %d из 3. Отвеет: ", tries);
            String answer = scanner.nextLine();

            switch (answer)
            {
                case "подсказка":
                    if (tries == 1) {
                        System.out.println("Заархивированный вирус");
                    }
                    else
                    {
                        System.out.println("Подсказка недоступна");
                        tries--;
                    }
                    break;
                case "заархивированный вирус":
                    System.out.println("Правильно!");
                    return;
                default:
                    if (tries < 3) {
                        System.out.println("Подумай ещё!");
                    }
                    break;
            }
        }
        while (tries++ < 3);

        System.out.println("Обидно, приходи в другой раз");

    }
}