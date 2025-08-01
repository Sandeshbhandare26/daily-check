public class Sort3 {
    public static void main(String [] args){
        int[] arr={1,6,2,8,5,7};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];//set current element to check with previous
            int j=i-1;//to start arry from 1


            while(j>=0 && current<arr[j]){//run till find greater than elem or make it first element
                arr[j+1]=arr[j];//keep shifting place
                j--; //place of element
            }
            arr[j+1]=current;//finalise element

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }

    }
}
