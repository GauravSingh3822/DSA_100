package Arrays_Coding_Question;

import java.util.ArrayList;
import java.util.List;

public class Question_3 {
    public static List<Integer> Repeated(int []arr){
        int n = arr.length;
        int[]freq = new int[n];
        boolean[] visited = new boolean[n];
        List<Integer>res = new ArrayList<>();
        int i =0;
        while(i< arr.length){
            int x =arr[i];
            freq[x]++;
            i++;
        }
        int j =0;
        while(j< arr.length){
            int y = arr[j];
            if(freq[y]>1 && !visited[y]){
                res.add(y);
                visited[y]=true;
            }
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {1,2,2,3,4,4,5,2};
        List<Integer> repeated = Repeated(arr);
        for(int x:repeated){
            System.out.print(x+" ");
        }

    }
}
