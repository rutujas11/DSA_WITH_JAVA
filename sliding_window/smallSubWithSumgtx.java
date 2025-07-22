public class smallSubWithSumgtx {
    public static int smallsub(int[] arr, int x){
        if(arr.length == 1 && arr[0] <x) return 0;

        int r = 0, l = 0, sum = 0;
        int minlen = arr.length;
        boolean flag = false;
        while(r<arr.length){
            sum += arr[r];
            while(sum>x){
                flag = true;
                minlen = Math.min(minlen, r+1-l);
                sum -= arr[l];
                l++;
            }
            r++;
        }
        if(!flag) return 0;
        return minlen;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,45,6,2,0,19};
        int result = smallsub(arr, 51);
        System.out.println("length of smallest subarray with sum greater than 51 is : "+result);  
        // output --> 3 --> subarray {45,6,2} has sum == 53 which is smallest sum which is greater than 51(x)
    }
}
