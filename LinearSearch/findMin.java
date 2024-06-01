package LinearSearch;

import java.util.Arrays;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {12,33,23,44,90,3,4,0,1};
        int result = findMin(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The minimum number is: " + result);
    }

    //Function to find the minimum
    public static int findMin(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int minvalue = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
}
