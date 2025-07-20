//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class F2 {
    public static void fun(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter the n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fun(n);
    }
    }