package Mathematical_Coding_Question;

import java.util.function.Predicate;

public class Question_6_Even_Odd {
    static boolean isEven(int n){
        Predicate<Integer> predicate = x->x%2==0;
        boolean test = predicate.test(n);
        return test;
    }
    public static void main(String[] args) {
        System.out.println(isEven(121));
    }
}
