package Mathematical_Coding_Question;

public class Question_3_Last_Digit {
    static  int last(int n){
        int ans = n%10;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(last(121));

    }
}
