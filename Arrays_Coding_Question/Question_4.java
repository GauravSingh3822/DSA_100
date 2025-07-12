package Arrays_Coding_Question;

import java.util.Arrays;

public class Question_4 {
    public static int SecondLaregest(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-2]; // )(nlogn)
    }
    public static void main(String[] args) {
        int []arr = {12,35,1,10,34};
        int ans = SecondLaregest(arr);
        System.out.println(ans);
    }
}
