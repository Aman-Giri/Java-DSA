package Arrays.JustforPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element of the 2d array: ");
        int[][] arr = new int[3][3];

        //taking input for the array by using for loop
        for(int row = 0;row < arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = input.nextInt();
            }
        }

        //After taking the input printing the output of the array: 
        // for(int row = 0;row < arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        //using other method to print the 2d Array

        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
