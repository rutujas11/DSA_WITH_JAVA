import java.util.ArrayList;
public class Sub_with_givensum {
    public static ArrayList<Integer> subarraySum(int[] arr, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(sum == 0) return res;
        int l = 0;
        int currsum =0;
        for(int r = 0;r<arr.length;r++){
            currsum += arr[r]; 
            
            while(currsum > sum && l<=r){
                currsum -= arr[l++];
            } 
            
            if(currsum == sum){
                res.add(l+1);
                res.add(r+1);
                return res;
            }
            
             
        }
        return res;
    }
    public static void main(String[] args){
        int[]arr = {15, 2,4,8,9,5,10,23};
        int sum = 23;
        System.out.println("Resultant array : "+subarraySum(arr, sum));

    }
}
