package LinearSearch;

import java.util.Arrays;

public class SearchinString {
    public static void main(String[] args) {
        String myname = "Aman";
        System.out.println(Arrays.toString(myname.toCharArray()));
        System.out.println(search2(myname, 'm'));
        
    }

    //Function to search in String using the for loop 
    public static boolean search1(String name, char target){
        if(name.length() == 0){
            return false;
        }

        for(int i=0;i<name.length();i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        
        return false;
    }

    //Function to search in String using the for Each loop 
    public static boolean search2(String name, char target){
        if(name.length() == 0){
            return false;
        }

        for(char ch : name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        
        return false;
    }

}
