public class LinearSearch{
    // Function to perform linear search
    public static int linear_search(int num[],int key){
        // Traverse the array
        for(int i=0; i<num.length ; i++){
            // check if current element matches the key
            if(num[i] == key){
                return i; // return index if found
            }
        }
        // if key is not found in the array
        return -1;
    }
    public static void main (String args[]){
        int num[] = {2,5,1,9,11,8}; // input array
        int key = 11; // element to search
        
        // Call linear search function 
        int index = linear_search(num,key);

        // check result
        if(index ==-1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index"+" "+ index);
        }
    }
}
