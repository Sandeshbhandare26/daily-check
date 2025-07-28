public class Bitw3 {
    public static void main(String[] args) {
        int n=5;//0101 we are now setting clear that is 0001
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask=~bitmask;
        
        int newnum=notbitmask & n;
        System.out.println(newnum);
    }
    
}
