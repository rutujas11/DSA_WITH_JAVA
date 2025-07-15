


public class quickSort {

    static int partition(int[] arr, int low, int high){
        int i = low-1;
        int pivot = arr[high];
        for(int j = low; j<=high-1; j++){
            if(arr[j] < pivot){
                i+=1;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static void swap(int[] arr,int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


    static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static void main(String args[]){
        int arr[] = {4, 1, 3, 9, 7};
        
        quicksort(arr, 0,arr.length-1);

        System.out.println("Quick Sort");
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+"--->");
        }
    }
}
