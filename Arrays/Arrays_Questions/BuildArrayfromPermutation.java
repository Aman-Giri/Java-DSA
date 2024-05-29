package Arrays.Arrays_Questions;

import java.util.Arrays;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        int[] permutation = {0, 2, 1, 5, 3, 4};
        int[] results = buildArray(permutation);
        System.out.println("The Array is: " + Arrays.toString(results));
    }

    //Function to build the array from permutation
    public static int[] buildArray(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
