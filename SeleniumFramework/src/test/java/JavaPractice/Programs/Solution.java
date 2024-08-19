package JavaPractice.Programs;

public class Solution {
        public static int[] duplicates(int arr[], int n) {
            int[] result = new int[n];
            int resultIndex = 0;
            int currentIndex = 0;

            while (currentIndex < n) {
                int num = Math.abs(arr[currentIndex]);
                if (arr[num - 1] < 0) {
                    result[resultIndex++] = num;
                } else {
                    arr[num - 1] = -arr[num - 1];
                }

                currentIndex++;
            }

            if (resultIndex == 0) {
                return new int[]{-1};
            }

            int[] finalResult = new int[resultIndex];
            System.arraycopy(result, 0, finalResult, 0, resultIndex);
            return finalResult;
        }

    public static void main(String[] args) {
            int []arr={2,3,1,2,3};
            int n=5;
        System.out.println(duplicates(arr,n));

    }
}

