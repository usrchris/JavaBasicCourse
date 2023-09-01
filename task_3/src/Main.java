
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[] {1, 2, 3, 4, 5};
        int firstIndex = 0;
        int lastIndex = myArray.length - 1;
        int midIndex = myArray.length / 2;
        int pocket = myArray[firstIndex];
        myArray[firstIndex] = myArray[lastIndex];
        myArray[lastIndex] = pocket;

        System.out.println(myArray[firstIndex] + myArray[midIndex]);
    }
}
