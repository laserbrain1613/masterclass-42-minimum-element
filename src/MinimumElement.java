import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int[] array = readElements(readInteger());
        System.out.println("The lowest value in the array is : " + findMin(array));

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many elements you wish to enter: ");
        int value = scanner.nextInt();
        return (value > 0) ? value : 1;
    }

    private static int[] readElements(int elements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[elements];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + " out of " + array.length + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            minValue = Math.min(minValue, array[i]);
        }
        return minValue;
    }

}