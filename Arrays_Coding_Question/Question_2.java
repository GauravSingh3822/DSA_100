package Arrays_Coding_Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Question_2 {
    public static int[] Missing_Element(int[]arr,int n){
        int[] count = new int[n + 1]; // Frequency array

        // Step 1: Count frequency of each element
        for (int num : arr) {
            if (num <= n) { // Ignore out-of-range values
                count[num]++;
            }
        }

        // Step 2: Find all missing elements
        ArrayList<Integer> missingList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missingList.add(i);
            }
        }

        // Step 3: Convert ArrayList to int[]
        int[] result = new int[missingList.size()];
        for (int i = 0; i < missingList.size(); i++) {
            result[i] = missingList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[]arr={1,1,2,3,3,4,4,6,7,9,9,10,10,10};
        int[] missingElements = Missing_Element(arr, 10);
        System.out.print("Missing Elements: ");
        if (missingElements.length == 0) {
            System.out.println("No missing elements.");
        } else {
            for (int num : missingElements) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}
