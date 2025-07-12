package Mathematical_Coding_Question;

public class Question_4_AP {
    static int AP(int a,int d,int n){
        int ans = a+(n-1)*d;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(AP(2,3,5));
    }
}
