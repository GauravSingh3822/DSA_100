package Pattern_Question;

public class Question_8_Rhombus_Pattern {
    static void Rhombus_Pattern(int n){
        int row,col,space;
        for(row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.print("|");
            }
            for(col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Rhombus_Pattern(6);
    }
}
