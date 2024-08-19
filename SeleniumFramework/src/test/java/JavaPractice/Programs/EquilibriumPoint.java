package JavaPractice.Programs;

public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        int leftSum = 0;
        int sum = 0;
        if(n==1)
            return n;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        for (int i=0;i<n;i++)
        {
            sum-=arr[i];
            if(sum==leftSum)
                return i+1;
            leftSum +=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        long arr[]={1,3,5,2,2};
        int n=5;

        System.out.println(EquilibriumPoint.equilibriumPoint(arr,n));
    }
}
