package Pattern_Question;

public class Question_5_Number_Changing_Pyramid {
    static void Number_Changing_Pyramid(int n){
        int row,col;
        int num=1;
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Number_Changing_Pyramid(6);

    }
}
