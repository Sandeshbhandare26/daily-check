import java.util.Scanner;

public class Bitw4 {
    public static void main(String[] args) {
        System.out.println("0101");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter \n0 for making zero\n1 for making one");
        int c=sc.nextInt();

        if(c==1){
            int n=5;
            System.out.println("posistion");
            int pos=sc.nextInt();
            int bitmask=1<<pos;
            int newnum=bitmask | n;
            System.out.println(newnum);
        }
        else{
            int n=5;
            System.out.println("posistion");
            int pos=sc.nextInt();
            int bitmask=1<<pos;
            int negbit=~bitmask;
            int newnum=negbit & n;
            System.out.println(newnum);
            
        }
    }
    
}
