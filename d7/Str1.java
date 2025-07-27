public class Str1 {
    public static void main(String[] arg){
        StringBuilder sb=new StringBuilder("SandeshBhandare");
        System.out.println(sb.charAt(2));//to print char at index 2
        sb.setCharAt(4, 'i');//to replace a char
        System.out.println(sb);//print string

        sb.insert(0, 'I'); //to insert a char at some index
        System.out.println(sb);
        

    }
}