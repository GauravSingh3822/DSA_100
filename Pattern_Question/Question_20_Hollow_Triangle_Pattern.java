package Pattern_Question;

public class Question_20_Hollow_Triangle_Pattern {
    static void Hollow_Triangle_Pattern(int n){
        int row,star,space;
        for(row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(star=1;star<=2*row-1;star++){
                if(star==1 || star==(2*row-1) ||row==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_Triangle_Pattern(6);
    }
}
