package Arrays.Arrays_Questions;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = shuffleArray(arr, 3);
        System.out.println("Shuffled Array is: " + Arrays.toString(ans));
    }

    //Function to shuffle the Array
    public static int[] shuffleArray(int[] nums, int n){
        int[] result = new int[2*n];
        for(int i=0;i<n;i++){
            result[2*i] = nums[i]; // filling the even position with first half element
            result[2*i+1] = nums[i+n]; // filling the odd position with second half element
        }

        return result;
    }
}
