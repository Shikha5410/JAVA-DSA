public class SubArraySum{
    // Function to calculate the sum of all Subarrays
    public static void subarraysum(int arr[]){
        int n = arr.length; // size of array
        int total = 0; // stores total sum of all subarrays

        // Outer loop -> starting index of subarray
        for(int i=0;i<n;i++){ 
            
         // Middle loop -> ending index of subarray
            for(int j=i;j<n;j++){   
                int sum = 0; // sum of current subarray

                // Inner loop -> prints elements from i to j  
                  for(int k=i;k<=j;k++){
                    System.out.print(arr[k] +" "); // print element
                    sum += arr[k]; // add element to current sum
                }
                total += sum; // add current subarray sum to total
                System.out.println(); // move to next line
            }
        }
        // Print final total sum of all subarrays
        System.out.print("Total sum of subarray :" + total);
    }
    public static void main (String args[]){
        int arr[] = {2,4,6,8,10};
        subarraysum(arr);
    }
}
