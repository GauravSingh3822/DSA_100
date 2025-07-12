package Pattern_Question;

public class Question_1_Hollow_Square {
    public static void HollowSquare(int n){
        for(int row =1;row<=n;row++){
            for(int col =1;col<=n;col++){
                if(row==1 || col==1 || row==n || col==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowSquare(5);
    }
}
