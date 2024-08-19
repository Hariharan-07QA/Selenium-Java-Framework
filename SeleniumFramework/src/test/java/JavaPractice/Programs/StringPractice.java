package JavaPractice.Programs;

public class StringPractice {
    static String s1="java";
    static String s2="java";


    public static void main(String[] args) {
        System.out.println(StringPractice.s1);
        System.out.println(StringPractice.s2);
        String s3=new String("java");
        String s4=new String("java");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}
