//Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;

public class F1{
    public static void fun1(int a,int b ,int c){
        System.out.println("Average is "+ (a+b+c)/3);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter int a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        fun1(a, b, c);
    }
}