public class StringCompression{

    // function to do compression in string
    // TC is O(n) and SC is O(n)
    public static String stringCompression( String str){
        // Handle edge case:null or empty string
        if(str==null || str.length() ==0){  
          return str;
        }
        // StringBuilder to store compressed result
        StringBuilder sb = new StringBuilder(); 
         
        int count=1; // to count frequency of characters

        for(int i=1;i<=str.length();i++){
            // if same character continues, increase count
            if(i<str.length() && str.charAt(i)==str.charAt(i-1)){  
                count++;
            }else{
                // Character group ended- append previous character
                sb.append(str.charAt(i-1));
                if(count>1){ // append count only if greater than 1
                    sb.append(count);
                }
                // Reset count for next character 
                count=1;
            }
        }
        // Return final compressing string
        return sb.toString();
    }
    public static void main (String args []){
        String str = "aaabbccccdd";
        System.out.println(stringCompression(str));
    }
}