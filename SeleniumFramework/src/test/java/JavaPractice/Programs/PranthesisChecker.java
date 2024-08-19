package JavaPractice.Programs;

public class PranthesisChecker {
    static boolean ispar(String x)
    {
       String []arr= x.split(",");
        System.out.println();

        return false;
    }

    public static void main(String[] args) {
        String s="{,},[,],(";
        PranthesisChecker.ispar(s);
    }
}
