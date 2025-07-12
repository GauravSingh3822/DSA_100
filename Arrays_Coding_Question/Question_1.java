package Arrays_Coding_Question;

public class Question_1 {
     public static int Missing_Elements(int []arr,int n){
         int Total_sum =n*(n+1)/2;
         int sum =0;
         for(int i =0;i< arr.length;i++){
             sum+=arr[i];
         }
         return Total_sum - sum;


     }
    public static void main(String[] args) {
         int [] arr ={1,1,2,3,4,5,6,7,9,10};
        int ans = Missing_Elements(arr, 10);
        System.out.println("Missing Element : "+ans);

    }
}
