
import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elemtents of array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
