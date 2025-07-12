package Pattern_Question;

public class Question_15_Reverse_Left_Half_Pyramid {
    static void Reverse_Left_Half_Pyramid(int n){
        for(int row =n;row>=1;row--){
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
        Reverse_Left_Half_Pyramid(6);

    }
}
