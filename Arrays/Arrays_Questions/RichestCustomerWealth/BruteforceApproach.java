package Arrays.Arrays_Questions.RichestCustomerWealth;

public class BruteforceApproach {
    public static void main(String[] args) {
        int[][] arr = {
                        {2,3},
                        {4,5},
                        {4,4}
                        };
        int balance = findMaxWealth(arr);
        System.out.println("Maximum is: " + balance);
    }

    //function to find the maximum of wealth
    public static int findMaxWealth(int[][] accounts){
        int maxwealth = 0;
        for(int[] account : accounts){
            int wealth = 0;
            for(int balance : account){
                wealth += balance;
            }
            maxwealth = Math.max(wealth, maxwealth);
        }
        return maxwealth;
    } 
}
