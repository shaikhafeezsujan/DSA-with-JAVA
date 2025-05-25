/*
Time Complexity : O(n)
Space Complexity: O(1)



package Arrays;

public class Kadanes_subarray {
    public static void maxSubArray(int[] arr){
        int curr =0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(curr,max);
        }
        
        System.out.println(max);
    }
    public static void main(String[] args){
        int [] arr = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArray(arr);
    }
}


