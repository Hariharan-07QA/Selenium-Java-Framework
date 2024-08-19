package JavaPractice.Programs;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicatesInArray {
    public static ArrayList<Integer> duplicates(int[]arr,int n)
    {
        ArrayList <Integer>list =new ArrayList<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                if(arr[i]==arr[j])
                {
                   count ++;
                   if(count>0 && (!list.contains(arr[i])))
                   {
                       list.add(arr[i]);
                   }
                }
            }

        }
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
      int []arr={2,3,1,2,3,2};
      int n=6;
        System.out.println(DuplicatesInArray.duplicates(arr,n));
    }
}
