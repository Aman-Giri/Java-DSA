package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysofObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[4];
        System.out.println("Enter the elements of the Object array: ");
        //for loop for taking the input for the String array
       for(int i=0;i<arr.length;i++){
           arr[i] =  input.nextLine();
       }
      

        //for loop for iterating the element of the String array: 
        // for(String names : arr){
        //     System.out.println("the elements of the array: " + Arrays.toString(arr));
        // }

    

        //Printing the elements of the object array in the String format 
         System.out.println("the elements of the array: " + Arrays.toString(arr));
         changeelement(arr);
         System.out.println("the elements of the array: " + Arrays.toString(arr));
        
    }

    //Arrays passing in the function
    public static void changeelement(String[] arr){
        arr[0] = "Prateek Dash";
    }
}
