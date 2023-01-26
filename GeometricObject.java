package assingment6;

import java.util.*;

public abstract class GeometricObject {

    private String color;
    private boolean filled;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor() {
        System.out.println("Enter color : ");
        Scanner w = new Scanner(System.in);
        color = w.next();
    }

    public void setFilled() {
        System.out.println("Enter filled : ");
        Scanner t = new Scanner(System.in);
        filled = t.nextBoolean();
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String display() {
        return "color : " + color + " filled :  " + filled;
    }

}
