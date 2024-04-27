import java.util.Arrays;
import java.util.*;
import java.io.*;

public class Day_1 {

//====================================================================================
//     Question-1----Find Factorial
    public static int fact(int n){
        int res=1;
        for(int i=1;i<n;i++){ // Time complexity=O(n)
            res=res*i;       // Space Complexity=O(1)
        }
        return res;
    }
//======================================================================================

// Question-2-----Finf factorial using Recursive Approach
public static int Recursin_fact(int n){
        if(n==0){
            return 1;           // Time Complexity=O(n)
        }                      //  Space Complexity=O(n)
        return n*Recursin_fact(n-1);
}
//=======================================================================================

// Question-3----Trailing zeros in Factorial
// Naive Approach
public static int Trailing_Zeros(int n){
    int fact=1;                         // factorial of 5=120  hence Output=1
    for(int i=1;i<=n;i++){              // factorial of 10=3628800 hence Output=2
        fact=fact*i;                    // Time complexity=O(n)
    }
    int count_zeros=0;
    while(fact%10==0){
        count_zeros++;
        fact=fact/10;
    }
    return count_zeros;

}
//========================================================================================

// Question-4-----------Trailing zeros in Factorial(Efficient Solution)
public static int Count_Trailing_Zeros(int n){
    int fact=1;                         // factorial of 5=120  hence Output=1
    for(int i=1;i<=n;i++){              // factorial of 10=3628800 hence Output=2
        fact=fact*i;}
         int count_Zero=0;
          for(int j=5;j<=n;j=j*5){
              count_Zero=count_Zero+(n/j);
          }
          return count_Zero;
    }
//==========================================================================================

// Question-5--------------------HCF or GCD of two numbers
    public static int gcd(int a,int b) {
        int res = Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0){     // Time Complexity= 0(min(a,b))
                break;
            }
            res--;
        }
        return res;
    }
//============================================================================================

// Question-6-----------------LCM of two numbers
public static int lcm(int a,int b){
        int res=Math.max(a,b);       //Time Complexity=O(a*b-max(a,b))
        while (true){
            if(res%a==0 && res%b==0)
                return res;
                res++;
            }
}
//===============================================================================================

// Question-7-------Check Prime
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2;i<=n;i++){ // Time complexity=O(n)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
//================================================================================================

// Question-8----------- Prime(Better Approach)

    public static boolean is_Prime(int n){
        if(n==1)
            return false;
        for(int i=2;i*i<n;i++){ // Time complexity=O(sqrt(n))
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
//===============================================================================================

//Question-9----------------Prime(more Efficient Solution)

    public static boolean is__Prime(int n){
        if(n==0)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        } return true;
    }
//===================================================================================================

// Question-10------------------------------------All Divisor Of a Number
    public static void printDivisor(int n){
        for (int i=1;i<=n; i++){     // Time Complexity=O(n)
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
//===================================================================================================

// Question-11----------------------------Prime Factor(Naive Approach)
public static void Prime_Factor(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                int x=i;

            while(n%x==0){
                System.out.println(i);
                   x=x*i;
                     }
            }
        }

}
//====================================================================================================================

// Question-12--------------------------------Prime Factor(Efficient Approach)
     static void print_Prime_factor(int n){
        if(n==1){
            return;
        }
        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>1){
            System.out.print(n+" ");
        }
     }

//====================================================================================================================

// Question-13---------------------------------------------------------------Sieve Of Erotosthence(All Divisor of a Number)
 static void Sieve(int n){
        if(n==1){
            return;
        }
        boolean isPrime[]=new boolean[n+1];
     Arrays.fill(isPrime,true);
     for(int i=2;i*i<n;i++) {
         if (isPrime[i]) {
             for (int j = 2 * i; j <= n; i++) {
                 isPrime[j] = false;
             }
         }
     }
         for(int i=2;i<=n;i++){
             if(isPrime[i])
                 System.out.print(i);
     }
 }
//======================================================================================================================

//Question-14---------------------------------------Counting Power(Naive Approach)
    static int Counting_Power(int x,int n){
        int res=1;
        for(int i=0;i<n;i++){
            res=res*x;
        }
        return res;
    }
//======================================================================================================================

//Question-15--------------------------------------------Counting Power(Efficient Approach)
  static int Counting_power(int x,int n){

        if(n==0)
            return 1;
      int temp=Counting_power(x,n/2);
        temp=temp*temp;
        if(n%2==0){
            return temp;}
        else
            return temp*x;
}
//=====================================================================================================================
    public static void main(String[] args) {
        System.out.println(Counting_power(2,3));
    }
}
