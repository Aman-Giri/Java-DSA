package Arrays.JustforPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ALInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in AL");
        int noofelements = in.nextInt();

    ArrayList<Integer> list = new ArrayList<>(noofelements);
    System.out.println("Size" + list.size()); // It will print zero

   

    System.out.println("Please enter the element: ");

    //input
    for(int i=0;i<noofelements;i++){
        list.add(in.nextInt());
    }

    // for(int num : list){
    //     System.out.println(num);
    // }

    System.out.println("The list is: " + list);
    System.out.println("Size" + list.size()); // It will print the actual size of the array


    }
}
