package Arrays.Code;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your arraylist");
        int noofElements = in.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>(noofElements);

        System.out.println("Enter the values for the ArrayList: ");

        for(int i=0;i<5;i++){ // this loop will only take the input when we will be defining the initial capacity for the arraylist
            list.add(in.nextInt());
        }

        for(int i=0;i<noofElements;i++){
            System.out.println("The list is: "+ list.get(i));
          
        }

       // System.out.println("The List is: "+ list);
    }
}
