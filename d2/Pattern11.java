public class Pattern11 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            int s=2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
                        int s=2*(n-i);

            for(int j=s;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println("");
            
        }
    }
    
}
