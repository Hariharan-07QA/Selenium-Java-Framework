package JavaPractice;

public class MainClass {
    public static void main(String[] args) {
        int num=1;
        int n=1;
        for(int i=5;i>=1;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <n; k++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
            num=1;
            n++;
        }
    }
}
