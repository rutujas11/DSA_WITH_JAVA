public class searching_algos {

/////--->1) Linear Search
    public static void linear_search(int[] arr, int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Linear Search : key found at index : "+i);
                return;
            }
        }
        System.out.println("Not found");
    }

/////--->2) Binary Search
    public static int binary_search(int[] arr, int low, int high, int key){
        if(low<=high){
            int mid = (high+low)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(key > arr[mid]){
                return binary_search(arr, mid+1, high, key);
            }
            return binary_search(arr, low, mid-1, key);
        }
        return -1;
        
    }

    public static void main(String args[]){
        int[] arr = {2,2,3,4,5,6,7,8,9};
        int key = 4;
        System.out.println("LINEAR SEARCH");
        linear_search(arr, key);
        System.out.println("BINARY SEARCH");
        int result = binary_search(arr, 0, arr.length-1, key);
        if(result == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Binary Search : key found at index : "+result);
        }
        

    }
}
