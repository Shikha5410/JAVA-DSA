public class LeftRotate{
    // Function to reverse part of array from index 'first' to 'end'
    public static void reverse(int arr[], int first, int end){
        
        while(first<end){
            // Swap elements
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;

            // Move pointers
            first++;
            end--;
        }
    }
    // Functions to left rotate array by k positions 
    public static void left_rotate(int arr[],int k){
        int n = arr.length;
        // Handle cases where k > n
        k = k % n;
        // Reverse first k elements
        reverse(arr,0,k-1);
        // Reverse remaining elements
        reverse(arr,k,n-1);
        // Reverse the whole array
        reverse(arr,0,n-1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int key = 2; // Number of rotations
        
        // Call rotation function
        left_rotate(arr,key);
        // Print rotated arrray
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
