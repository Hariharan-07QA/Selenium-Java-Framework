package LeetCodeProblems;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
       char[] arr= s.toCharArray();

        ArrayList list =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }

            }

int size =list.size();

        return size;
    }
    int missingNumber(int n, int arr[]) {
        int total =(n+1)*n/2;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
             sum += arr[i];
        }
        int missingnumber = total -sum;
        return missingnumber;


    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Set set =new HashSet();
        ArrayList list = new ArrayList();
        for(int num :arr)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
            else if(!list.contains(num))
            {
                list.add(num) ;
            }
        }
        if(list.isEmpty())
        {
            list.add(-1);
            return list;
        }
        else
            return list;
    }

    public static void main(String[] args) {

      String s = "pwwkew";
        System.out.println( LongestSubstring.lengthOfLongestSubstring(s));

    }
}
