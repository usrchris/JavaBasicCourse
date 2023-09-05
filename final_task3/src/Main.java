import jdk.jfr.SettingControl;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int quantity = scanner.nextInt();
        String[] lines = new String[quantity];
        int string_number = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.print("Введите строку номер " + (i + 1) + ": ");
            lines[i] = scanner.next();
        }

        int ix = 0;
        int ix_size = 0;

        for (int i = 0; i < quantity; i++) {

            for (int j = 0; j < lines[i].length(); j++) {
                Set unique = new HashSet();
                unique.add(lines[i].charAt(j));

                if (ix_size < unique.size()) {
                    ix_size = unique.size();
                    ix = i;
                }
            }
        }

        System.out.println(lines[ix]);
    }
}