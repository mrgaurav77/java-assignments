package Assignment_3;

import java.util.Scanner;

abstract class Shape {
    abstract void area();

    abstract void volume();
}

class Cone extends Shape {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void area() {
        double l = Math.sqrt(r * r + h * h);
        double area = Math.PI * r * (r + l);
        System.out.println("Area of Cone = " + area);
    }

    void volume() {
        double volume = (1.0 / 3) * Math.PI * r * r * h;
        System.out.println("Volume of Cone = " + volume);
    }
}

class Cylinder extends Shape {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void area() {
        double area = 2 * Math.PI * r * (r + h);
        System.out.println("Area of Cylinder = " + area);
    }

    void volume() {
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of Cylinder = " + volume);
    }
}

class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of Cone: ");
        double r1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        System.out.print("Enter radius and height of Cylinder: ");
        double r2 = sc.nextDouble();
        double h2 = sc.nextDouble();
        Cone c = new Cone(r1, h1);
        Cylinder cy = new Cylinder(r2, h2);
        c.area();
        c.volume();
        cy.area();
        cy.volume();
        sc.close();
    }
}