//febonacci series
import java.util.Scanner;

public class F7 {
    public static void feb(int n){
        int f1=0;
        int f2=1;
        for(int i=1;i<n;i=i+2){
            System.out.print(f1+" ");
            System.err.print(f2+ " ");
            f1=f1+f2;
            f2=f2+f1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        feb(n);
    }    
}
