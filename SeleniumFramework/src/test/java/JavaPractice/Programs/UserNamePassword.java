package JavaPractice.Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args) {
        Map<String,String> credentials=new HashMap<>();
        credentials.put("Hari","Hari@123");
        credentials.put("Remo","Remo@123");
        Scanner sc1=new Scanner(System.in);
        String user=sc1.next();
        String password=sc1.next();
        int count=1;
        for (int i = 1; i <4; i++) {
            if(count<3) {
                if (credentials.containsKey(user) && password.equals(credentials.get(user))) {
                    System.out.println("User Logged In successfully");
                    break;
                } else if (!password.equals(credentials.get(user))) {
                    System.out.println("Invalid password Please Try again");
                    password=sc1.next();
                    count++;
                }
            }
            else {
                System.out.println("Account Locked");
            }
        }
    }
}
