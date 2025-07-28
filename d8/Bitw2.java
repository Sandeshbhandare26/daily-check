public class Bitw2 {
    public static void main(String[] args) {
        int n=5;//0101 we are now setting the 1 position bit as 1
        int pos=1;
        int bitmask=1<<pos;
        
        int newnum=bitmask | n;
        System.out.println(newnum);
    }
    
}
