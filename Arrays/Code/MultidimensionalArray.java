package Arrays.Code;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //declaring the multi dimensional array: 
        int[][] arr = new int[3][3];
        
        //We can also declare the 2d array like this: 
        int[][] arr2d = {
                            {1,2,3}, // 0-index
                            {3,4},// 1-index
                            {4,5,4}// 2-index
                    };
        /*
         * Note:
         * 1. While declaring the 2d array if we will not give number of columns then also its fine bcz 
         *    in 2d array we store elements like matrix and each row has a different index number so for each 
         *    row number the number of columns can be anynumber itself
         */
        
         System.out.println("Enter the elements for the 2d array: ");
         //Taking the input for the 2d array
         for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = input.nextInt();
            }
         }

        //  //Output of the 2d Array after taking the input: 
        //   for(int row =0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        //  }

        //Output of the 2d array in the stringformat
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
