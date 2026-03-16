
// This program takes the names of countries as input and displays them in descending order.
import java.util.Scanner;

class CountryNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of countries: ");
        int n = sc.nextInt();
        sc.nextLine();
        String country[] = new String[n];
        System.out.println("Enter country names:");
        for (int i = 0; i < n; i++) {
            country[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (country[i].compareTo(country[j]) < 0) {
                    String temp = country[i];
                    country[i] = country[j];
                    country[j] = temp;
                }
            }
        }
        System.out.println("Countries in descending order:");
        for (int i = 0; i < n; i++) {
            System.out.println(country[i]);
        }
        sc.close();
    }
}