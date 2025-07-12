package Pattern_Question;

public class Question_10_Butterfly_Pattern {
    static void Butterfly_Pattern(int n){
        int row, col, space;
//==================================================================================
        // Upper part
        for(row=1;row<=n;row++){
            // Left Stars
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            // Space
            for(space=1;space<=2*(n-row);space++){
                System.out.print(" ");
            }
            // Right Star
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
//==================================================================================
        // Lower part
        for (row = 2; row <= n; row++) {
            // Left stars
            for (col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            // Spaces
            for (space = 1; space <= 2 * (row-1); space++) {
                System.out.print(" ");
            }
            // Right stars
            for (col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly_Pattern(6);
    }
}
