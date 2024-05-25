package Arrays.Arrays_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class MaxinArray {
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
        int maximum = maxRange(arr, 0,2);
        System.out.println("The maximum inside the above array is: " + maximum);



    }

    //Function to find the max
    public static int max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //Function to find the maximum in range
    public static int maxRange(int[] arr, int start, int end){
        int max = arr[start];
        for(int i=start;i<= end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
