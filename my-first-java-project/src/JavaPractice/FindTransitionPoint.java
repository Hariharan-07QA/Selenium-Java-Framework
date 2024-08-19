package JavaPractice;

public class FindTransitionPoint {
    static int transitionPoint(int arr[], int n) {
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if ((i + 1) < n) {
                if (arr[i] < arr[i + 1] || arr[i] > arr[i + 1]) {
                    return i + 1;
                }
            }
        }
        if(sum>0)
            return 0;
        else
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1};
        int n = arr.length;
        System.out.println(FindTransitionPoint.transitionPoint(arr,n));
    }
}
