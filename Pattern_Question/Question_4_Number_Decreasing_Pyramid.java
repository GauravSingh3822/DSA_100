package Pattern_Question;

public class Question_4_Number_Decreasing_Pyramid {
    static void Number_Decreasing_Pyramid(int n){
        int row,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=n-row+1;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Number_Decreasing_Pyramid(6);

    }
}
