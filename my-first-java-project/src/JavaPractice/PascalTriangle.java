package JavaPractice;

import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<Long> triangle(int n)
    {
        ArrayList<Long> list=new ArrayList<Long>();
        long pascal=(long) Math.pow(11,n);

        list.add(pascal);
        return list;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle=new PascalTriangle();
        System.out.println(pascalTriangle.triangle(0));
    }

}
