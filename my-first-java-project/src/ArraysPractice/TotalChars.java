package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class TotalChars {
    public static void main(String[] args) {
        String name ="Deebika";
        List<Character> chars =new ArrayList<>();
       char[]arr= name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
           char character =arr[i];
            int count =1;
            if(!chars.contains(character)){
                System.out.println("Letter -->"+character);
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j]==character) {
                        count++;
                    }
                }
                System.out.println(count);
                chars.add(arr[i]);
                count = 1;
            }
        }
    }
}
