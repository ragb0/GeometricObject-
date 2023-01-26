package assingment6;

import java.util.Scanner;

public class triangle extends GeometricObject implements Comparable<triangle> {

    private double side1;
    private double side2;
    private double side3;

    public triangle() {
    }
    public triangle (String color , boolean filled , double side1 , double side2 , double side3){
    super (color ,filled);
      this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public triangle(double side1, double side2, double side3) {
        throws illegalTriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1() {
        System.out.println("Enter side 1 : ");
        Scanner x = new Scanner(System.in);
        side1 = x.nextDouble();
    }

    public void setSide2() {
        System.out.println("Enter side 2 : ");
        Scanner z = new Scanner(System.in);
        side2 = z.nextDouble();
    }

    public void setSide3() {
        System.out.println("Enter side 3 : ");
        Scanner y = new Scanner(System.in);
        side3 = y.nextDouble();
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getarea() {
        return (side1 + side2 + side3) / 2;
    }

    public double getperimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String display() {
        return "side 1 : " + side1 + "\nside 2 : " + side2 + "\nside 3 : " + side3 + "\n area : " + getarea() + "\n perimeter : " + getperimeter();
    }

    public int compareTo(triangle t) {
        if (getarea() > t.getarea()) {
            return 1;
        } else if (getarea() < t.getarea()) {
            return -1;
        } else {
            return 0;
        }
    }

}
