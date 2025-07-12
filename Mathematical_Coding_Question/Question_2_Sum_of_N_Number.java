package Mathematical_Coding_Question;

public class Question_2_Sum_of_N_Number {
    static int  Sum(int n){
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sum(3));

    }
}
