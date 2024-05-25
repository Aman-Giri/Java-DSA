package Arrays.JustforPractice;

import java.util.Arrays;

public class MultidimensionalArrayColisnotfixed {
    public static void main(String[] args){
        int[][] arr2d = {
                            {1,2,3}, // o index
                            {4,5}, // 1 index
                            {6,7,8,9} // 2 index
                        };

        System.out.println("Printing the arays: *******************");

        //print the aboive array using the for loop
        // for(int row = 0;row<arr2d.length;row++){
        //     for(int col=0;col<arr2d[row].length;col++){
        //         System.out.print(arr2d[row][col] + " ");
        //     }
        //     System.out.println();
        
        // }

        for(int row=0;row<arr2d.length;row++){
            System.out.println(Arrays.toString(arr2d[row]));
        }

        
        
    }
}
