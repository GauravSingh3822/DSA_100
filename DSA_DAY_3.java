//=============================================DAY-3=================================================
import java.util.*;
public class DSA_DAY_3 {
//==========================================Patter-Question==================================
/* Question-1---------------------------Square-Print
              * * * *
              * * * *
              * * * *
              * * * *
     */
    static void print_Patter(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
//============================================================================================
/*    Question-2
           * * * *
           *     *
           *     *
           * * * *        */
    static void print_Hollow_Square(){
        int n=4;
        int m=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0|| j==0||i==n-1||j==m-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
              System.out.println();
        }

    }
//===============================================================================================
/*    Question-3
        *
        * *
        * * *
        * * * *
 */
    static void Right_angle_Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
//===============================================================================================
/* Question-4
            * * * *
            * * *
            * *
            *
 */
    static void print_Inverted_Right_Angle(int n){
        for (int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
//======================================================================================================================
/* Question-5
                             *
                           * *
                         * * *
                       * * * *
 */
    static void print_inverted_Right(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//======================================================================================================================
/* Question-6
                     1
                     1 2
                     1 2 3
                     1 2 3 4
 */
    static void print_Number_Right(int n){
        for (int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
//======================================================================================================================
/* Question-7
                       1 2 3 4 5
                       1 2 3 4
                       1 2 3
                       1 2
                       1

 */
    static void Print_Inverted_Patttern(int n){
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
//======================================================================================================================
/* Question-8
                  1
                  2 3
                  4 5 6
                  7 8 9 10
                  11 12 13 14 15
 */
static void Print_Patttern(int n){
    int number=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }

}
//======================================================================================================================
/* Question 9
                    1
                    0 1
                    1 0 1
                    0 1 0 1
                    1 0 1 0 1
 */
    static void number_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("1"+" ");
                else
                    System.out.print("0"+" ");
            }
            System.out.println();
        }
    }
//======================================================================================================================
/*  Question-10;
                     *
                     * *
                     * * *
                     * * * *
                     * * * * *
                     * * * * *
                     * * * *
                     * * *
                     * *
                     *

 */
    static void print_Right_Pascal_Triangle(int n){
        // uppar half part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        // lpwer part
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
//======================================================================================================================
/* Quartion-11
                             *                 *
                             * *             * *
                             * * *         * * *
                             * * * *     * * * *
                             * * * * * * * * * *
                             * * * * * * * * * *
                             * * * *     * * * *
                             * * *         * * *
                             * *             * *
                             *                 *
 */
    static void Print_ButterFly(int n){
        for(int i=1;i<=n;i++) {
            // print star
            for (int j = 1; j <= i; j++){
                System.out.print("*");}

            // for Spaces
            for (int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");}
            for(int j=1;j<=i;j++)
                System.out.print("*");

            System.out.println();
        }
            // lowwer Half part
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++)
                    System.out.print("*");

                // for Spaces
                for (int j = 1; j <= 2 * (n - i); j++)
                    System.out.print(" ");
                for(int j=1;j<=i;j++)
                    System.out.print("*");

                System.out.println();
            }
        }
//======================================================================================================================
/* Question-12
                          * * * * *
                        * * * * *
                     * * * * *
                   * * * * *
                 * * * * *

 */
    static void Pattern_1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//======================================================================================================================
/* Question-13
                            1
                          2   2
                        3   3   3
                      4  4    4   4
                    5    5    5   5  5
 */
    static void Pattern_2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
//======================================================================================================================
/* Question-13

 */
static void Pattern_3(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
//======================================================================================================================
/* question-15
                             1
                           2 1 2
                         3 2 1 2 3
                       4 3 2 1 2 3 4
                    5  4 3 2 1 2 3 4 5


 */
static void Pattern_4(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // First half
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        // 2n Half number
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
//======================================================================================================================
/* Question-16
                                   *
                                 * * *
                               * * * * *
                             * * * * * * *
                             * * * * * * *
                               * * * * *
                                 * * *
                                   *

 */
    static void Pattern_5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n=5;
        Pattern_5(n);
    }
}
