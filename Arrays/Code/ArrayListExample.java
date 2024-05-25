package Arrays.Code;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList is a class which implements list interface
        ArrayList<Integer> list = new ArrayList<Integer>();

        //adding the integers in the list
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("The List is: "+list);

        //changing the value at any index
        list.set(0, 90);
        System.out.println("The List is: "+ list);

        //removing the value from any particular index
        list.remove(1);
        System.out.println("The List is: "+list);

        
    }
}
