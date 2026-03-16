
// This program calculates the area and perimeter of a rectangle based on user input for length and breadth.
import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);

        sc.close();
    }
}
