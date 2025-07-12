package Pattern_Question;

public class Question_21_Hollow_Reverse_Triangle_Pattern {
    static void Hollow_Reverse_Triangle_Pattern(int n){
        int row,space,star;
        for(row =n;row>=1;row--){
            for(space=row;space<=n;space++){
                System.out.print(" ");
            }
            for(star =1;star<=(2*row-1);star++){
                if(star==1||star==(2*row-1)||row==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_Reverse_Triangle_Pattern(6);
    }
}
