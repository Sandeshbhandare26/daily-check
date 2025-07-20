//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;
public class F4 {
    public static void fun(){
        Scanner sc=new Scanner(System.in);
        int c=1; //to enter number continuesly 
        int pc=0; //positive count
        int nc=0; //negative count
        int z=0; //count of zeros
        while(c==1){
            System.out.println("Enter a number");
            int n=sc.nextInt();
            if(n>=1){
                pc++;
            }
            else if(n<=-1){
                nc++;
            }
            else{
                z++;
            }
            System.out.println("do you want to continue \n(0 to exit/ 1 to continue)");
            c=sc.nextInt();
        }
        System.out.println("positive:"+pc+" negative:"+nc+" zeros:"+z);

    }
    public static void main(String [] arg){
        
        fun();
    }
    
}
