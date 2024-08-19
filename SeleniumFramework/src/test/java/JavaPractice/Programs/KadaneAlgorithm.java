package JavaPractice.Programs;

public class KadaneAlgorithm {
    static long maxSubarraySum(int arr[], int n){
        int sum =0;
        int max=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum > max)
            {
                max=sum;
            }
        }
            return max;
    }
    public static void main(String[] args) {
    int []arr={-10,-2,-3,-4};
    int n=4;
        System.out.println(KadaneAlgorithm.maxSubarraySum(arr,n));
    }
}
