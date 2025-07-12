package Arrays_Coding_Question;

import java.util.HashMap;

public class Question_Two_Sum{
    public static boolean two_sum(int [] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int sum = target - arr[i];
            if(map.containsKey(sum)){
                return true;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7};
        int target = 8;
        System.out.println(two_sum(arr, 8));
        
        
    }
}
