package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Vehicles <T> {
    int length;
    T[] arr;

    void declareSize(int size) {
        arr = (T[]) new Object[size];
        length = size;
    }

    void add(int pos,T value) {
      arr[pos]=value;
    }

    void printValues()
    {
        for (T values:arr) {
            System.out.println(values);
        }
    }


    String name;
    T vehicleType;
    T manufacturingYear;

    public static void main(String[] args) {

        Vehicles<String> vehicles1 = new Vehicles<>();
        vehicles1.declareSize(3);
        vehicles1.add(0,"Hari");
        vehicles1.add(1,"Name");
        vehicles1.add(2,"haran");
        vehicles1.printValues();
        LinkedList<Integer>num=new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println("Peek Element :"+ num.peek());
        System.out.println("Peek First :"+ num.peekFirst());
        System.out.println("Peek last :"+ num.peekLast());
//        System.out.println("Poll Element :"+ num.poll());
//        System.out.println("poll First :"+ num.pollFirst());
//        System.out.println("poll last :"+ num.pollLast());
        System.out.println("Peek Element :"+ num.pop());
        System.out.println("After pop :" + num);
        num.push(4);
        System.out.println("After push :" + num);


        Iterator itr = num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

