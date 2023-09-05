
public class Main {
    public static void main(String[] args) {

        double [] myArray = new double [15];

        double d;

        for (int i = 0; i < 15; i++) {
            do {
                d = Math.floor(Math.random() * 100 - 20);
            }
            while (d < -20 || d > 20);
            myArray[i] = d;
        }

        double max = myArray[0];
        double min = myArray[0];

        for (int i =  1; i < 15; i++) {
            max = Math.max(myArray[i], max);
            min = Math.min(myArray[i], min);
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        double module = Math.max(Math.abs(max), Math.abs(min));

        System.out.println("Наибольший модуль: " + module);
    }
}