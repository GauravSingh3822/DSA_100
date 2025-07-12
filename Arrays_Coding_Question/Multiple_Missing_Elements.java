package Arrays_Coding_Question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Multiple_Missing_Elements {
    public static List<Integer> missingElements(int[]arr,int start,int end) {
        List<Integer> missing = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = start; i <=end; i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int [] arr ={1,3,5};
        int start = 1,end = 7;
        List<Integer> list = missingElements(arr, 1, 7);
        System.out.println(list);


    }
}
