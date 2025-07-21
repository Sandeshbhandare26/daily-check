//gcd in java using recursion

import java.util.*;

public class F6 {
    public static void gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("gcd is "+a);

    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        gcd(a,b);



    }
}