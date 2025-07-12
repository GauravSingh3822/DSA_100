package Pattern_Question;

public class Question_2_Number_Triangle {
    public static void Triangle(int n){
        for(int row =1;row<=n;row++){
            for(int space =1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangle(6);

    }
}
