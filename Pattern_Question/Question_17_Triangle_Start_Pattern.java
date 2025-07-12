package Pattern_Question;

public class Question_17_Triangle_Start_Pattern {
    static void Triangle_Start_Pattern(int n){
        for(int row = 1;row<=n;row++){
            // space
            for(int space=n-row;space>=1;space--){
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Triangle_Start_Pattern(6);
    }
}
