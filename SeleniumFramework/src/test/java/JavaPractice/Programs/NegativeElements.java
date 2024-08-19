package JavaPractice.Programs;

import java.util.Arrays;

public class NegativeElements {
    // To move negative elements to the left of an array
    public static void main(String[] args) {
        int []a={3,5,-2,1,-5};
        int length = a.length;
        int []b = new int[length];
        int count =0;
        for (int i = 0; i < length; i++) {
            if(a[i]<0)
            {
                count++;
            }
        }
        System.out.println(count);
        int start=0;
        int end=count;
        for(int number : a)
        {
            if (number <0) {
                b[start]=number;
                start ++;
            }
            else {
                b[end]=number;
                end++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
