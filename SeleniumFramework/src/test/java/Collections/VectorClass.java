package Collections;

import java.util.Stack;
import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {
        Stack v = new Stack();
        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.peek());
        System.out.println(v);
        System.out.println(v.pop());
        System.out.println(v);
        System.out.println(v.push(11));
        System.out.println(v);
    }
}
