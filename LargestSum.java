package Arrays;

public class LargestNum {
    public static void largestSum(int[] arr){
        int Largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(Largest<arr[i]){
                Largest = arr[i];
            }
        }
        System.out.println(Largest);
    }
    public static void main(String[] args){
        int arr1[] ={2,3,4,1,9};
        LS(arr1);
    }
}
