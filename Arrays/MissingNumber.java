public class MissingNumber{
    // find missing number using sum method
    public static int missing_number(int arr[]){
        int n = arr.length +1; //one number is missing
        
        int total = n*(n+1)/2; //sum of 1 to n
        int sum = 0;
        for(int num :arr){
           sum+=num;
        }
        return total-sum; //missing number
    }
    public static void main (String args[]){
        int arr[] = {1,2,4,5};
        System.out.print("missing number :" + missing_number(arr));
    }
}
