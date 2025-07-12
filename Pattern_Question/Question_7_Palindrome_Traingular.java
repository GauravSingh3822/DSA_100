package Pattern_Question;

public class Question_7_Palindrome_Traingular {
    static void Palindrome_Traingular(int n){
        int row,col,space;
        for(row = 1;row<=n;row++){
            for(space=1;space<=2*(n-row);space++){
                System.out.print(" ");
            }
            for(col =row;col>=1;col--){
                System.out.print(col+"|");
            }
            for(col=2;col<=row;col++){
                System.out.print(col+"|");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Palindrome_Traingular(6);
    }
}
