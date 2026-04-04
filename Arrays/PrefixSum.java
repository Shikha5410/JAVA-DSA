public class PrefixSum{
    public static void prefixsum (int num[]){
        int Maxsum = Integer.MIN_VALUE;
        int cursum =0;
        
        //step 1: calculate prefix sum
        int prefix[] = new int [num.length];
        prefix[0] = num[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] +num[i];
        }
        
        //step 2: find maximum subarray sum
        for(int i=0;i<num.length;i++){
            int start =i;

            for(int j=i;j<num.length;j++){
                int end = j;

                cursum = start==0? prefix[end]:prefix[end]-prefix[start-1];

                if(Maxsum<cursum){
                    Maxsum=cursum;
                }
            }
        }
        System.out.println("Maxsum is "+ Maxsum);
    }
    public static void main (String args[]){
        int num[]= {1,-2,6,-1,-3};
        prefixsum(num);
    }
    
}