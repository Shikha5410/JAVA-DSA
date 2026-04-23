public class ConvertToUppercase{
    
    // function to convert initial letters(lowercase) to uppercase
    // TC is O(n) and SC is O(n)
    public static String convertToUppercase(String str){
        StringBuilder sb = new StringBuilder(""); // using stringbuilder to do modifications

        if(str == null || str.isEmpty()){
            return str;
        }

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); // adding character

        for(int i=1;i<str.length();i++){
            // checking if empty space is there or not
            if(str.charAt(i)==' '&& i<str.length()-1){
               sb.append(str.charAt(i));
               i++; // if empty space is there then next letters is capitalise
               sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i)); // if no empty space then add the character 
            }
        }
        return sb.toString(); // return final string after modification 
    }
    public static void main (String args[]){
        String str= "hello, i am shikha kushwaha" ;
        System.out.println(convertToUppercase(str));
    } 
}