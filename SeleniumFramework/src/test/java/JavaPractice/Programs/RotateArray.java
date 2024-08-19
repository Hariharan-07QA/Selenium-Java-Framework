package JavaPractice.Programs;

import java.util.Arrays;

public class RotateArray {
    static void rotateArr(int[]arr,int d,int n)
    {
int k=d%n;
        System.out.println(k);
//        for (int i = d; i <n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for(int j=0;j<d;j++)
//        {
//            System.out.print(arr[j]+" ");
////        }
//         int []arr2=Arrays.copyOfRange(arr,d,n-1);
//        System.out.println(Arrays.toString(arr2));
//
//        int []arr1=Arrays.copyOfRange(arr,0,d);
//        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
         int []arr={2,4,6,8,10,12,14,16,18,20};
         int d=2;
         int n =5;
        RotateArray.rotateArr(arr,d,n);

    }
}
