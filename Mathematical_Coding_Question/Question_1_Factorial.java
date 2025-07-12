package Mathematical_Coding_Question;

import java.math.BigInteger;

public class Question_1_Factorial {
    static int factorial(int n){
        if (n==0) return 1;
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    static BigInteger fact(int N){
        if(N==0) return BigInteger.ONE;
        BigInteger factorial = BigInteger.ONE;
        for(int i =1;i<=N;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(factorial(120));
        System.out.println(fact(999));

    }
}
