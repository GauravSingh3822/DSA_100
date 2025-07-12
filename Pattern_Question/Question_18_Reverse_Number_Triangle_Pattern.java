package Pattern_Question;

public class Question_18_Reverse_Number_Triangle_Pattern {
    static void Reverse_Number_Triangle_Pattern(int n){
        for(int row =1;row<=n;row++){
            for(int space =1;space<=row;space++) {
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Reverse_Number_Triangle_Pattern(6);
    }
}
