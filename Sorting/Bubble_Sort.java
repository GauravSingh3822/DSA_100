package Sorting;

public class Bubble_Sort {
    public static void bubble_sort(int[]arr,int n){
        for(int i =0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[]arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int[]arr = {5,2,6,1,3,4,7};
        int n = arr.length;
        bubble_sort(arr, n);
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
