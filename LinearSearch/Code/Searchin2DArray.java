package LinearSearch.Code;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
            };
        
        int[] result = search(arr, 34);
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println("The target is: " + Arrays.toString(result));
        System.out.println("Maximum in the 2d array: " + findmax(arr));
    }

    //Search the target in the 2d array and return the index
    public static int[] search(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Search max in the 2d array
    public static int findmax(int[][] arr){
        int max = Integer.MIN_VALUE; // the minimum value an integer can hold
        for(int[] ar : arr){
            for(int element : ar){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
