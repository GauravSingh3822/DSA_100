package Pattern_Question;

public class Question_6_Zero_One_Triangle {
    static void zero_one_Triangle(int n){
        int row ,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                if((row+col)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_Triangle(4);
    }
}
