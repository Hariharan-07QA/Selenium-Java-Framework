package JavaPractice.Programs;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    static int getPairsCount(int[] arr, int n, int k) {

        int count =0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i:arr)
        {
            int x = k-i;
            if(map.containsKey(x))
            {
                count += map.get(x);
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
      int []arr={1,5,7,1};
      int k=6;
      int n=4;
        System.out.println(CountPairsWithGivenSum.getPairsCount(arr,n,k));
    }
}
