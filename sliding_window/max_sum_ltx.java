public class max_sum_ltx {
    public static int maxSubarrSum(int[] arr, int x){
        int l = 0;
        int sum = 0, maxsum = 0;
        for(int r = 0;r<arr.length;r++){
            sum += arr[r];
            while(sum>x && l<r){
                sum = sum-arr[l++];
            }

            if(sum <= x){
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        int result = maxSubarrSum(arr, 7);
        System.out.println("Maximum sum of subarray smaller than x(7) is : "+result);  
        //output --> 2+4 = 6 (<7)
    }
}
