package Arrays.JustforPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiALExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>()); // Here i have added the list inside the list
        }

        System.out.println("Enter the elements to fill in the Multidimensional List:");

        //Now adding the elements
        for(int i=0;i<3;i++){ // for list
            for(int j=0;j<4;j++){ // for elements
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println("The list is: " + list);

    }
}
