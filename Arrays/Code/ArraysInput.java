package Arrays.Code;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[4];

        System.out.println("Enter the element of the array: ");

        //for loop for taking the array input from the user
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }

        //For loop for iterating the element of the array
        for(int i=0;i<arr.length;i++){
            System.out.println("The element of the array you entered are: "+ arr[i]);
        }

        //To print the the array element into the String format
        System.out.println("The Arrays are: " + Arrays.toString(arr));
    }
}
