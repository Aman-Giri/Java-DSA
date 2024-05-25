package Arrays.Code;

public class ArraysExample {
    public static void main(String[] args) {
        String name = "Aman Giri";
        String name1 = "Mukul";

        int roll1 = 23;
        int roll2 = 33;
        int roll3 = 55;

         
        int[] rollnumbers; // rollnumbers is the ref variable which is storing into the stack memory
        rollnumbers = new int[4]; //object is created into the heap memory 

        // int[] arr = new int[4]; // Syntax for defining the array in java

        System.out.println("Integer Array: " + rollnumbers[0] );

        //String Array: 
        String[] names = new String[3];
        System.out.println("String Array: " + names[1]);
        
    }
}
