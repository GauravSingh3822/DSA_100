package Pattern_Question;

public class Question_9_Diamond_Pattern {
    static void Diamond_Pattern(int n){
        // Upper part
        int row,col,space;
        for(row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.print("|");
            }
            for(col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part (repeat from row=1 to n-1, but reverse shape)
        for(row = 1; row <=n-1; row++){
            for(space = 1; space <= row; space++){
                System.out.print("|");
            }
            for(col = 1; col <= 2 * (n - row)-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
           Diamond_Pattern(5);
    }
}
