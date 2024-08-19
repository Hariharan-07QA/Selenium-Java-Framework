package JavaPractice.Programs;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class DuplicatesSolution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {

        for (int i = 0; i < n; i++)
        {
            int index = arr[i] % n;
            arr[index] += n;
        }
        int flag = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] / n) > 1)
            {
                ans.add(i);
                flag = 1;
            }
        }
        if (flag == 0) ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={2,3,1,2,3};
        int n=5;
        System.out.println(DuplicatesSolution.duplicates(arr,n));
    }
}
