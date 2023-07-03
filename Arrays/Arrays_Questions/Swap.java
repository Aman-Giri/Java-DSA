package Arrays.Arrays_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];

        System.out.println("Enter the elements of the Array you want to swap: ");
        //taking the input for the array
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        //Before swap
       System.out.println("Before Swapping: " + Arrays.toString(arr));
        swap(arr, 0, 1);

        //After swapping:
        System.out.println("After Swapping: " + Arrays.toString(arr));
    }

    //Function to swap the two indexes in the above array
    public static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
