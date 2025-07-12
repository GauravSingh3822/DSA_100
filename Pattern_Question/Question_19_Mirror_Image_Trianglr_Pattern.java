package Pattern_Question;

public class Question_19_Mirror_Image_Trianglr_Pattern {
    public static void Mirror_Image_Trianglr_Pattern(int n){
        int row,col,space;
        // Upper Part
                for(row=1;row<=n;row++){
                    for(space=1;space<=row;space++){
                        System.out.print(" ");
                    }
                    for(col=row;col<=n;col++){
                        System.out.print(col+" ");
                    }
                    System.out.println();
                }
        // Lower Part
        for(row=n-1;row>=1;row--){
            for(space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(col=row;col<=n;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Mirror_Image_Trianglr_Pattern(6);
    }
}
