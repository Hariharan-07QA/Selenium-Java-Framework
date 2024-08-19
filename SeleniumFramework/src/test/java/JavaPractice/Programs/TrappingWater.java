package JavaPractice.Programs;

public class TrappingWater {
    static long trappingWater(int[] arr,int n)
    {
        long sum=0;
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j <n; j++) {
                if(arr[i]>arr[j])
                {
                    sum+=(arr[i]-arr[j]);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       int arr[]={8,8,2,4,5,5,1};
       int n=7;
        System.out.println(trappingWater(arr,n));
    }
}
