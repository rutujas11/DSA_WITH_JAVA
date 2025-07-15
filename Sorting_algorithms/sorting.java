public class sorting {
    public static void printarray(int arr[]){
        for(int num : arr){
            System.out.print("  "+ num);
        }
    }
    
//-----> Bubble sort          time complexity = O(n^2)
    public static void main(String args[]){
        int arr[] = {7,8,3,12,1};

        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble sort : ");
        printarray(arr);
//--------------------------------------------------------------------------------------------------------

//-----> Selection sort   O(n^2) worst best avg
        int arr1[] = {8,9,0,1,10};
        for(int i = 0;i<arr1.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr1.length;j++){
                if(arr1[j] < arr1[min]){
                    min = j;
                }
            }
            int temp = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = temp;
        }
        System.out.println("\nSelection sort : ");
        printarray(arr1);

//------------------------------------------------------------------------------------------------------

//----->Insertion Sort  O(n^2) worst, best = O(n)
        int arr2[] = {8,7,3,2,1};
        for(int i = 1;i<arr2.length;i++){
            int curr = arr2[i];
            int j = i-1;
            while(j>=0 && curr<arr2[j]){
                arr2[j+1] = arr2[j];
                j--;
            }
            arr2[j+1] = curr;
        }
        System.out.println("\nInsertion sort : ");
        printarray(arr2);
    }
}
