public class maxsum_subarray {
    public static int maxSum(int[] arr, int k){
        if(arr.length<k){
            System.out.println("Invalid input");
            return -1;
        }
        
        int maxsum = 0;
        for(int i = 0;i<k;i++){
            maxsum += arr[i];
        }

        int windowsum = maxsum;
        for(int i = k; i<arr.length;i++){
            windowsum = windowsum + arr[i] - arr[i-k];
            maxsum = Math.max(maxsum, windowsum);
        }

        return maxsum;
    }
    public static void main(String[] args){
        int k = 4;
        int[] arr = {1,4,2,10,2,3,1,0,20};

        int result = maxSum(arr, k);
        System.out.println("Maximum sum of subarray of size "+k+" is : "+result);
    }
}


