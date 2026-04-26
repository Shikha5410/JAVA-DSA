import java.util.Arrays;

public class AnagramChecker{
     
    public static void anagramChecker(String str1, String str2){
        // convert string to lowercase ,so that we don't have to check separatly for lower and uppercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // first check- If the length are same 
        if(str1.length()==str2.length()){
            // convert strings into char array
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            // sort the char array
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            // if the sorted char arrays are same or identical then strings are anagrams
            boolean result= Arrays.equals(arr1,arr2);
            if(result){
              System.out.println(str1+" and "+ str2 + " are anagrams to each other");
            }else{
                System.out.println(str1+" and "+str2+ " are  not anagrams to each other");
            }
        }else{
            // case when length are not same
            System.out.println(str1+" and "+str2+ " are not anagrams to each other");
        }
    }
    public static void main(String args []){
        String str1="Earth";
        String str2="Heart";

        anagramChecker(str1,str2);
    }
}