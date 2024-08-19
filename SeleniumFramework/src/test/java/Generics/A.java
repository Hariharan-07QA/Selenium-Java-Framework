package Generics;

public class A {
    A(Double x)
    {
        System.out.println("In Class A");
    }
}
class B extends  A
{
    B(int z)
    {

        super(20.0);
        System.out.println("In Class B");
    }

}
class C extends A{
    C()
    {
        super(10.0);
        System.out.println("In Class C");
    }
}
class main
{
    public static void main(String[] args) {
        C c1= new C();
    }

}

