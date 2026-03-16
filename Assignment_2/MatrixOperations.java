
// This program performs various operations on matrices such as addition, multiplication, and transpose based on user input.
import java.util.Scanner;

class MatrixOperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: // Matrix Addition
                    int a[][] = new int[2][2];
                    int b[][] = new int[2][2];
                    int c[][] = new int[2][2];
                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            a[i][j] = sc.nextInt();
                    System.out.println("Enter second matrix:");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            b[i][j] = sc.nextInt();
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            c[i][j] = a[i][j] + b[i][j];
                    System.out.println("Addition of matrix:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++)
                            System.out.print(c[i][j] + " ");
                        System.out.println();
                    }
                    break;
                case 2: // Matrix Multiplication
                    int m1[][] = new int[2][2];
                    int m2[][] = new int[2][2];
                    int m3[][] = new int[2][2];
                    System.out.println("Enter first matrix:");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            m1[i][j] = sc.nextInt();
                    System.out.println("Enter second matrix:");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            m2[i][j] = sc.nextInt();
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++) {
                            m3[i][j] = 0;
                            for (int k = 0; k < 2; k++)
                                m3[i][j] += m1[i][k] * m2[k][j];
                        }
                    System.out.println("Multiplication of matrix:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++)
                            System.out.print(m3[i][j] + " ");
                        System.out.println();
                    }
                    break;
                case 3: // Transpose
                    int t[][] = new int[2][2];
                    System.out.println("Enter matrix:");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            t[i][j] = sc.nextInt();
                    System.out.println("Transpose of matrix:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++)
                            System.out.print(t[j][i] + " ");
                        System.out.println();
                    }
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
