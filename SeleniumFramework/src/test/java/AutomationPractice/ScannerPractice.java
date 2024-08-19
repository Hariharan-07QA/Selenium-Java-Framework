package AutomationPractice;

import java.util.Scanner;

public class ScannerPractice{
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.print("Type the userName :");
        String name=sc1.next();
        sc1.nextLine();
        int age= sc1.nextInt();
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);

        int []arr=new int [4];
        for (int i = 0; i < 4; i++) {
           arr[i]= sc1.nextInt();
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}
