package LinearSearch;

import java.util.Arrays;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {2,45,22,99,91,4,23};
        int result = linearSearchinRange(arr, 22, 1, 5 );
        System.out.println("The Array is: " + Arrays.toString(arr));
        System.out.println("The target is: " + result);
    }

    //function to search in range
    public static int linearSearchinRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start ;i<end;i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }
}
