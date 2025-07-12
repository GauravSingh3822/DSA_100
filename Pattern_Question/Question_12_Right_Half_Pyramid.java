package Pattern_Question;

public class Question_12_Right_Half_Pyramid {
    static void Right_Half_Pyramid(int n){
        for(int row =0;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Right_Half_Pyramid(6);

    }
}
