package Arrays.Arrays_Questions;

import java.util.Arrays;

public class SmallerthancurrentNumber {
    public static void main(String[] args) {
        int[] nums = {12,3,4,5,77};
        int[] result = smallernumberthancurrentnumber(nums);
        System.out.println(Arrays.toString(result));
    }

    //function to find the number which is smaller than the current number
    public static int[] smallernumberthancurrentnumber(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
