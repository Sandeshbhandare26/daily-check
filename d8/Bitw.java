public class Bitw {
 public static void main(String[] args) {
    int n=5;//0101   here we are getting the position 1 (0,1,2,..) bit of 5 
     int pos=1;
     int bitmask=1<<pos;
     if((bitmask & n)==0){
        System.out.println("bit was zero");
     }
     else{
        System.out.println("bit was one");
     }
 }   
}
