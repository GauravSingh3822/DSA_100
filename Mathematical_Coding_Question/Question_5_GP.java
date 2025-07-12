package Mathematical_Coding_Question;

public class Question_5_GP {
    static double GP(int a,int r, int n){
        double ans = a*(Math.pow(r, n)-1);
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(GP(2,3,5));
    }
}
