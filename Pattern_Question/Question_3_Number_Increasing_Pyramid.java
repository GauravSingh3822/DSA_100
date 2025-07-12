package Pattern_Question;

public class Question_3_Number_Increasing_Pyramid {
    static void Number_Increasing_Pyramid(int n){
        int row,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    // 120!=?

    public static void main(String[] args) {
        Number_Increasing_Pyramid(6);

        // x = x*(row-col)/col;

    }

}
