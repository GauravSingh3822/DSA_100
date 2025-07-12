package Pattern_Question;

public class Question_16_K_Pattern {
    static void K_Pattern(int n){
        // Upper Part
        for(int row =n;row>=1;row--){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Part
        for(int row=2;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        K_Pattern(6);
    }
}
