//copy an array elements into other 

import java.util.Scanner;

public class Arr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int a1=sc.nextInt();
        System.out.println("Enter the no. of columns");
        int b1=sc.nextInt();
        int[][] arr1=new int[a1][b1];
    
        for(int i=0;i<a1;i++){
            for(int j=0;j<b1;j++){
            System.out.println("Enter the element for index "+i+" "+j);
            arr1[i][j]=sc.nextInt();
            }
        }

    }
    
}
