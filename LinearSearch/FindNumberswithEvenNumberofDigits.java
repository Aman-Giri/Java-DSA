package LinearSearch;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,1411};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    //function to find the numbers with even number digit
    public static int findNumbers(int[] nums){
        int count = 0;

        for(int element : nums){
            if(even(element)){
                count++;
            }
        }
        return count;
    }

    //Function to check if the number of digits are even are not
    public static boolean even(int num){
        int numberofdigits = digit(num);

        if(numberofdigits % 2 == 0){
            return true;
        }

        return false;
    }

    //Function to count the number of the digits inside any number
    public static int digit(int num){

        if(num < 0){
            return num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }

        return count;
    }

}
