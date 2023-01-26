package assingment6;
import java.util.Scanner;
public class assingment6 {

    public static void main(String args[]) {
   Scanner x = new Scanner (System.in);
   triangle triangle = new triangle();
   boolean done = false;
   double side1 = 1.0;
   double side2 = 1.0;
   double side3 = 1.0;
   System.out.println("enter three side : ");
   while(!done){
   try {
   triangle.setSide1();
   triangle.setSide2();
   triangle.setSide3();
   triangle = new triangle(side1,side2,side3);
   done = true;
   }
   catch(illegalTriangleException s){
       System.out.println(s.getMessage());
       System.out.println("enter three side : ");
       x.nextLine();
   }
   }
    }
}
