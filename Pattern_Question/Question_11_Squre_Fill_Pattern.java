package Pattern_Question;

public class Question_11_Squre_Fill_Pattern {
    static void Squre_Fill_Pattern(int n){
        int row,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Squre_Fill_Pattern(6);
    }
}
