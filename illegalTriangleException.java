/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment6;

/**
 *
 * @author DELL
 */
public class illegalTriangleException extends Exception{
    private double perimeter;
    public illegalTriangleException(double perimeter){
    super ("the sum of any two side  "+perimeter);
    this.perimeter=perimeter;
    }
    public double getperimeter(){
    return perimeter;
    }
}
