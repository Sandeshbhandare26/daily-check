public class Str2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Loveyou3000");

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-i-1;

            char frontch=sb.charAt(front);
            char backch=sb.charAt(back);

            sb.setCharAt(front, backch);
            sb.setCharAt(back, frontch);
        }
    System.out.println(sb);
    
    }
    }