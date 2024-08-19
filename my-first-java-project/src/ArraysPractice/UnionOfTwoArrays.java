package ArraysPractice;

public class UnionOfTwoArrays {
    public static int doUnion(int a[],int n,int b[],int m)
    {
        int count =0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <m; j++) {
                if(a[i]==b[j])
                {
                    count++;
                }
            }
        }
        int union = (m+n)-count;
        return union;
    }

    public static void main(String[] args) {

        int []a={85,25,1,32,54,6};
        int n=6;
        int []b={85,2};
        int m=2;
        System.out.println(doUnion(a,n,b,m));
    }
}
