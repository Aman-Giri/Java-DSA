package Arrays.Code;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialisation -- I am adding the list inside the list so that i can add the elements under those lists later
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        System.out.println("Enter the elements to fill in the Multidimensional List:");
        //adding the elements 
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println("The List is: " + list);
    }
}
