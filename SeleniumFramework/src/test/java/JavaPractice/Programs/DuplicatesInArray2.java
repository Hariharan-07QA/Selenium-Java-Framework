package JavaPractice.Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DuplicatesInArray2 {
    public static ArrayList<Integer> duplicates(int[]arr,int n)
    {
       ArrayList<Integer>list=new ArrayList<>();
       HashSet<Integer>set =new HashSet<>();

        for (int i = 0; i < n; i++) {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
            else if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        System.out.println(set);
        if(list.isEmpty())
        {
            list.add(-1);
            return list;
        }
        else
        {
            Collections.sort(list);
            return list;
        }
    }

    public static void main(String[] args) {
        int[]arr={3,4,12,3,12,3,4,4,12,7,11,6,5};
        int n=13;
        System.out.println(DuplicatesInArray2.duplicates(arr,n));

    }
}
