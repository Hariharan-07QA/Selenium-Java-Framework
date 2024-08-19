package JavaPractice.ArraysFunctions;

import java.util.Arrays;

public class MethodsInArrays {
    public static void main(String[] args) {
        int []employees= new int[12];
        System.out.println(Arrays.toString(employees));
        Arrays.fill(employees,30);
        System.out.println(Arrays.toString(employees));
        int []managers=new int [12];
        Arrays.fill(managers,30);
        System.out.println("Is Equal :"+Arrays.equals(employees,managers));
        int [] arrSort={2,5,6,7,4,6,8,1,7,4};
        Arrays.sort(arrSort);
        System.out.println("Array after sorting :" +Arrays.toString(arrSort));
        int [] copyArray=Arrays.copyOf(arrSort,6);
        System.out.println("Array after copying from index 0 to 6"+Arrays.toString(copyArray));
        int [] copyRangeArray=Arrays.copyOfRange(arrSort,3,8);
        System.out.println("Array after copying using range :"+Arrays.toString(copyRangeArray));
        System.out.println("Element Found :"+Arrays.binarySearch(arrSort,7));
    }
}
