public class SubArraySum{
    public static void subarraysum(int arr[]){
        int n = arr.length;
        int total = 0;
        
        for(int i=0;i<n;i++){    //start index
            
            for(int j=i;j<n;j++){   //end index
                int sum = 0;

                for(int k=i; k<=j ; k++){    //print subarray
                    System.out.print(arr[k] +" ");
                    sum += arr[k];
                }
                total += sum;
                System.out.println();
            }
        }
        System.out.print("Total sum of subarray :" + total);
    }
    public static void main (String args[]){
        int arr[] = {2,4,6,8,10};
        subarraysum(arr);
    }
}