package Arrays.Code;

import java.util.Arrays;

public class ArraywithColnotfixed {
    public static void main(String[] args) {
        int[][] arr2d = {
                            {1,2,3}, // 0-index
                            {3,4},// 1-index
                            {4,5,4}// 2-index
                    };

    //Print the above array: 
    // for(int row = 0; row<arr2d.length;row++){
    //     for(int col=0; col<arr2d[row].length;col++){
    //         System.out.print(arr2d[row][col]+" ");
    //     }
    //     System.out.println();
    // }

    //Printing the above array in the string format: 
    for(int row=0;row<arr2d.length;row++){
        System.out.println(Arrays.toString(arr2d[row]));
    }
    }
}
