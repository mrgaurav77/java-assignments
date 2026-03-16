
// This program takes a square matrix as input and provides a menu to calculate the sum of diagonal, upper diagonal, and lower diagonal elements.
import java.util.Scanner;

class MatrixMenu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, choice;
        System.out.print("Enter size of matrix: ");
        n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        do {
            System.out.println("\nMenu");
            System.out.println("1. Sum of Diagonal Elements");
            System.out.println("2. Sum of Upper Diagonal Elements");
            System.out.println("3. Sum of Lower Diagonal Elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int diagSum = 0;
                    for (int i = 0; i < n; i++) {
                        diagSum += a[i][i];
                    }
                    System.out.println("Sum of diagonal elements = " + diagSum);
                    break;
                case 2:
                    int upperSum = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i < j) {
                                upperSum += a[i][j];
                            }
                        }
                    }
                    System.out.println("Sum of upper diagonal elements = " + upperSum);
                    break;
                case 3:
                    int lowerSum = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i > j) {
                                lowerSum += a[i][j];
                            }
                        }
                    }
                    System.out.println("Sum of lower diagonal elements = " + lowerSum);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
        sc.close();
    }
}