
// This program takes an array of integers as input and displays the elements in reverse order.
import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements in reverse order:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}