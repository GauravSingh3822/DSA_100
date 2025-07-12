package Arrays_Coding_Question;

public class Question_5_Second_Largest {
    public static int second(int[]arr,int n){
        if(n<2){
            return -1;
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(first<arr[i]){
                first = arr[i];
            }
        }
        for(int i =0;i<n;i++){
            if(second<arr[i] && first!=arr[i]){
                second =arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int []arr={-1,-2,-39,-40,-90};
        int n = arr.length;;
        System.out.println(second(arr,n));

    }
}
