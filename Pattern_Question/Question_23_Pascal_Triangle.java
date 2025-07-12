package Pattern_Question;

public class Question_23_Pascal_Triangle {
    static void printPascal(int n){
        int row,col,space;
        for(row =1;row<=n;row++){
            // space
            for(space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            int x = 1;
            for(col=1;col<=row;col++){
                System.out.print(x+" ");
                x=x*(row-col)/col;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPascal(5);

    }
}
