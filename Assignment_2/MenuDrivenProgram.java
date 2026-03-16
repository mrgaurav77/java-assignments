
// This program provides a menu-driven interface to perform various operations such as calculating the volume of a cylinder, finding the factorial of a number, and checking if a number is an Armstrong number.
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. C1alculate Volume of Cylinder");
            System.out.println("2. Find Factorial");
            System.out.println("3. Check Armstrong Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Volume of Cylinder
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    double volume = Math.PI * radius * radius * height;
                    System.out.println("Volume of Cylinder = " + volume);
                    break;
                case 2:
                    // Factorial
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial of " + num + " = " + fact);
                    break;
                case 3:
                    // Armstrong Number Check
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();
                    int original = number;
                    int sum = 0, remainder;

                    while (number != 0) {
                        remainder = number % 10;
                        sum += remainder * remainder * remainder;
                        number /= 10;
                    }
                    if (sum == original)
                        System.out.println(original + " is an Armstrong Number.");
                    else
                        System.out.println(original + " is NOT an Armstrong Number.");
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}
