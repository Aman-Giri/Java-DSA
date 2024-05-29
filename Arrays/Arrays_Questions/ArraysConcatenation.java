package Arrays.Arrays_Questions;

import java.util.Arrays;

public class ArraysConcatenation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] result = concArray(arr);
        System.out.println("the array is" + Arrays.toString(result));
    }

    //Function to concatenate the array
    public static int[] concArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i=0;i<2*n;i++){
            ans[i] = nums[i%n];
        }
        return ans;
    }
}
