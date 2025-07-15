public class mergeSort {
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                merged[k] = arr[i];
                i++;
                k++;
            }
            else{
                merged[k] =arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            merged[k] = arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            merged[k] = arr[j];
            j++;
            k++;
        }

        for(int id = 0, jd=si; id<merged.length; id++,jd++){
            arr[jd] = merged[id];
        }
    }


    public static void divide(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);

    }
    public static void main(String args[]){
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr,0,n-1);
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx]+" ");
        }
        
    }

    }

