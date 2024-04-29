//====================================================DAY-2=============================================================
import java.util.*;
import java.io.*;
public class DSA_Day_2 {

//======================================================================================================================
// Question-1---------------------------------------Check kth bit Set or Not(I/P:n=5(0101) and k=1===> O/P yes
public static void isKthBitSet(int n,int k) {
    if ((n & (1 << (k - 1))) == 1)
        System.out.println("Yes");
    else
        System.out.println("Not Set");
}
//======================================================================================================================
// Question-2-------------------------------Count St Bit(Naive Approach
    static int Count_Set_Bits(int n){
    int count=0;
    while(n>0){
        if(n%2!=0)
            count++;
        n=n/2;
    }
    return count;
    }

//======================================================================================================================
// Question-4------------------------------------Count Set BIt(Bit Magic Method)
static int count_Set_Bits(int n){
    int count=0;
    while(n>0){
        if((n&1)==1)
            count++;
        n=n>>1;
    }
    return count;
}
//======================================================================================================================
// Question-5-----------------------------------Brian ans Kerningham Algorithm
static int count_set_bits(int n){
    int count=0;
    while(n>0){
        n=n&(n-1);
        count++;
    }
    return count;
}
//======================================================================================================================
// Question-6-------------------------------------Power of Two(Naive Approach)
    static boolean isPow(int n){
    if(n==0)
        return false;
    while(n!=1){
        if(n%2!=0)
            return false;
        n=n/2;

    }
    return true;
    }
//======================================================================================================================
// Question-7----------------------------------------Powwr of Two(Efficient Approach)
static boolean is_Pow(int n){
    if(n==0)
        return false;
    return ((n&(n-1))==0);
}
//======================================================================================================================
// Question-8----------------------------------------------One Odd Occuring(Naive Approach )
     static int One_Odd_Occuring(int arr[],int n){
    for(int i=0;i<=n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[j]==arr[i])
                count++;
        }
        if(count%2!=0)
            return arr[i];
    } return 0;
     }
//======================================================================================================================
//Question-9-----------------------------------------------------One Odd Occuring(Efficient Approach )
    static int One_odd_occuring(int arr[],int n){
    int res=0;
    for(int i=0;i<n;i++){
        res=res^arr[i];
    }
    return res;

    }
//======================================================================================================================
//Question-10-------------------------------------------------Two Odd Occurning(NAive Approach)
    static void Two_Odd_Occurning(int arr[],int n){

    for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++) {
            if(arr[i]==arr[j])
                   count++;
            if(count%2!=0)
                System.out.print(arr[i]+" ");
        }

     }

    }
//=====================================================================================================================
//Question-11---------------------------------------------------Two Odd Occurning(Efficient Approach)
    static void odd_Appearing(int arr[],int n){
      int res=0,res1=0,res2=0;
      for(int i=0;i<n;i++)
          res=res^arr[i];

      int Sn=res&(~(res-1));
          for(int i=0;i<n;i++) {
              if ((arr[i] & Sn) != 0)
                  res1 = res1 ^ arr[i];
              else
                  res2 = res2 ^ arr[i];
          }
        System.out.println(res1+" "+res2);

    }
//======================================================================================================================
    public static void main(String[] args) {
             int arr[] ={4,4,3,3,4,4,6,4,5,5,3,3};
             int n=12;
        odd_Appearing(arr,n);
    }
}
