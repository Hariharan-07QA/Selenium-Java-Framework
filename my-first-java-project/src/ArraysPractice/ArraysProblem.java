package ArraysPractice;

import java.util.ArrayList;

public class ArraysProblem {

//    static ArrayList<Integer> binarysearch(int[] arr, int n, int k) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == k) {
//                list.add(i);
//            }
//        }
//        if (list.isEmpty()) {
//            list.add(-1);
//        }
//        return list;
//    }

   static int binarysearch(int[]arr,int n, int k)
    {
        int element=-1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==k)
            {
               element=i;
            }
        }
        return element;

    }



    public static void main(String[] args) {
     int []arr={1,2,3,4,5};
     int k=4;
     int n=5;
        System.out.println(ArraysProblem.binarysearch(arr,n,k));
    }
}
