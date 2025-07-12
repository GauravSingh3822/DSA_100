package Sorting;

public class Selection_Sort {
    public static void Selection_Sort(int []arr,int n){
        for(int i =0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void swap(int[]arr,int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[]arr = {5,2,6,1,3,4,7};
        int n = arr.length;
        Selection_Sort(arr, n);
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
