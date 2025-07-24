
import java.util.Scanner;

public class Arr4 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int a=sc.nextInt();
        System.out.println("Enter no of column");
        int b=sc.nextInt();

        int[][] arr=new int[a][b];


        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println("Enter element for index "+i+""+j);
                arr[i][j]=sc.nextInt();
            }
        }
        int flag=0;
        System.out.println("Enter the element to find");
        int find=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(arr[i][j]==find){
                    System.out.println("Element found at index"+i+""+j);
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
    }
}