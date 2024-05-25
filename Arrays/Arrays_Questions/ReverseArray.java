package Arrays.Arrays_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner in = new Scanner(System.in);
        int arraysize = in.nextInt();
        int[] arr = new int[arraysize];
        System.out.println("Enter the element of the array");

        //taking input for the array
        for(int i=0;i<arraysize;i++){
            arr[i] = in.nextInt();
        }

        //printing the array: 
        System.out.println("The Array is: " + Arrays.toString(arr));

        //reverse the array
        reverse(arr);

        System.out.println("The Array after the reverse: " + Arrays.toString(arr));
        

    }

    //Function to reverse
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }


    //function to swap
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp ;
    }
}
