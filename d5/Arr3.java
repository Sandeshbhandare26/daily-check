
import java.util.Scanner;

public class Arr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elemtents of array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to search");
        int s=sc.nextInt();

        int flag=0;
        int i=0;
        while(i<n){
            if(arr[i]==s){
                flag=1;
                break;
            }
            i++;
        }

        if(flag==1){
            System.out.println("element found at "+ i + " index");
        }
        else{
            System.out.println("element not found");
        }
    }
    
}
