package Arrays.Arrays_Questions;

import java.util.Arrays;

public class SumofRunningArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = runningSuminArray(arr);
        System.out.println("the Array is: " + Arrays.toString(ans));
    }

    //Function for find the running sum in an array

    public static int[] runningSuminArray(int[] nums){
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
