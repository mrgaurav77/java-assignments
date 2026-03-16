package Assignment_3;

import java.util.Scanner;

interface Shape2 {
    void area();
}

class Circle implements Shape2 {
    final double PI = 3.14159;
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        double area = PI * r * r;
        System.out.println("Area of Circle = " + area);
    }
}

class Sphere implements Shape2 {
    final double PI = 3.14159;
    double r;

    Sphere(double r) {
        this.r = r;
    }

    public void area() {
        double area = 4 * PI * r * r;
        System.out.println("Surface Area of Sphere = " + area);
    }
}

class TestShape2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter radius of Sphere: ");
        double r2 = sc.nextDouble();
        Circle c = new Circle(r1);
        Sphere s = new Sphere(r2);
        sc.close();
        c.area();
        s.area();
    }
}
