package JavaPractice;

public class FirstRepeatingElementInArray {
    public static int firstRepeated(int []arr,int n)
    {
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               boolean isFound=false;
               if(isFound)
                   break;
               if(arr[i]==arr[j]) {
                   isFound =true;
                   return i + 1;
               }
           }
       }
       return -1;
//        int start=0;
//        int end =1;
//        int duplicate=0;
//        while(start<n) {
//            while (end < n) {
//                if (arr[start] != arr[end]) {
//                    end++;
//                } else if (arr[start] == arr[end]) {
//                    duplicate++;
//                    break;
//                }
//            }
//            end=0;
//            start++;
//            end =start+1;
//        }
//        if(duplicate==1)
//        return end+1;
//        else
//            return -1;
   }

    public static void main(String[] args) {
        int[]arr={1,5,3,4,3,5,6};
        int n=arr.length;
        System.out.println(FirstRepeatingElementInArray.firstRepeated(arr,n));
    }
}
