package Sorting;

public class SelectionSort {
    public static void Select(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int arr[]) {
        for (int i = 0;  i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        public static void main (String args[]){
        int arr[] = {5,4,1,2,3};
        Select(arr);
        print(arr);

    }
}
