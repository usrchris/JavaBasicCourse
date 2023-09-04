import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double meter = 0, mile = 0, yard = 0, foot = 0;
        double kilogram = 0, ton = 0, centner = 0, pound = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        int quantity = scanner.nextInt();
        int unit;
        double amount;

        switch (quantity) {
            case 1: // масса
                System.out.print("Выберите единицу измерения: 1 - килограмм, 2 - тонна, 3 - центнер, 4 - фунт: ");
                unit = scanner.nextInt();

                if (unit < 1 || unit > 4) {
                    System.out.println("Неверный выбор единиц измерения (" + unit + ")");
                    return;
                }

                System.out.print("Введите число: ");
                amount = scanner.nextDouble();

                switch (unit) {
                    case 1: // кг
                        kilogram = amount;
                        ton = amount * 0.001;
                        centner = amount * 0.01;
                        pound = amount * 2.205;
                        break;
                    case 2: // тонны
                        kilogram = amount * 1000;
                        ton = amount;
                        centner = amount * 0.1;
                        pound = amount * 2204.62;
                        break;
                    case 3: //центнер
                        kilogram = amount * 100;
                        ton = amount * 10;
                        centner = amount;
                        pound = amount * 220.462;
                        break;
                    case 4: //фунты
                        kilogram = amount * 0.453592;
                        ton = amount * 0.000453592;
                        centner = amount * 0.00453592;
                        pound = amount;
                        break;
                }
                System.out.println("Результат: ");
                System.out.println("Килограм = " + kilogram);
                System.out.println("Тон = " + ton);
                System.out.println("Центнеров = " + centner);
                System.out.println("Фунтов = " + pound);
                break;

            case 2: // расстояние
                System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
                unit = scanner.nextInt();

                if (unit < 1 || unit > 4) {
                    System.out.println("Неверный выбор едениц измерения (" + unit + ")");
                    return;
                }
                System.out.print("Введите число: ");
                amount = scanner.nextDouble();

                switch (unit) {
                    case 1: // метр
                        meter = amount;
                        mile = amount * 0.000621371;
                        yard = amount * 1.09361;
                        foot = amount * 3.28084;
                        break;
                    case 2: // миля
                        meter = amount * 1609.34;
                        mile = amount;
                        yard = amount * 1760;
                        foot = amount * 5280;
                        break;
                    case 3: // ярд
                        meter = amount * 0.9144;
                        mile = amount * 0.000568182;
                        yard = amount;
                        foot = amount * 3;
                        break;
                    case 4: // фут
                        meter = amount * 0.3048;
                        mile = amount * 0.000189394;
                        yard = amount * 0.333333;
                        foot = amount;
                        break;
                }
                System.out.println("Результат: ");
                System.out.println("Метр = " + meter);
                System.out.println("Миля = " + mile);
                System.out.println("Ярд = " + yard);
                System.out.println("Фут = " + foot);
                break;
            default:
                System.out.println("Неверный выбор что переводить (" + quantity + ")");
                break;
        }
    }
}