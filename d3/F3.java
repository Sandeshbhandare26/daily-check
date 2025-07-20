//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class F3 {
public static void fun(float r){
    System.out.println("circumference is "+(2*3.14*r));
} 
public static void main(String [] arg){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
    float r=sc.nextFloat();
    fun(r);

}
}


