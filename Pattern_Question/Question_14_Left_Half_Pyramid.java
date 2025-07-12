package Pattern_Question;

public class Question_14_Left_Half_Pyramid {
    static void Left_Half_Pyramid(int n){
        for(int row =1;row<=n;row++){
            for(int space =1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Left_Half_Pyramid(6);

    }
}
