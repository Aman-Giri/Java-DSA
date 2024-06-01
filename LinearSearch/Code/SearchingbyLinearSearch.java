package LinearSearch.Code;

public class SearchingbyLinearSearch {
    public static void main(String[] args) {
        int[] arr  = {2,44,3,90,77,14};
        System.out.println(linearSearch3(arr, 200));
    }

    //Function to search element and return its index
    public static int linearSearch1(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;

    }

    //Function to search and return the element itself
    public static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        return Integer.MAX_VALUE;

    }

    //Function to search and return true or false
    public static boolean linearSearch3(int[] nums, int target){
        if(nums.length == 0){
            return false;
        }

        for(int element : nums){
            if(element == target){
                return true;
            }
        }

        return false;
    }

}
